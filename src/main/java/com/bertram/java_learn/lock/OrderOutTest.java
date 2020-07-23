package com.bertram.java_learn.lock;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author wang
 * @date 2019/7/29 17:15
 */
public class OrderOutTest {
    volatile static int status = 1;

    /**
     * 交叉打印ABC
     *
     * @param args
     */
    public static void main(final String[] args) {
        final ReentrantLock lock = new ReentrantLock();
        final Condition conditionA = lock.newCondition();
        final Condition conditionB = lock.newCondition();
        final Condition conditionC = lock.newCondition();
        final Thread threadA = new Thread(() -> {
            lock.lock();
            try {
                while (status != 1) {
                    conditionA.await();
                }
                System.out.println("a");
                status = 2;
                conditionB.signalAll();
            } catch (final InterruptedException e) {
                e.printStackTrace();
            } finally {
                lock.unlock();

            }
        });

        final Thread threadB = new Thread(() -> {
            lock.lock();
            try {
                while (status != 2) {
                    conditionB.await();
                }
                System.out.println("B");
                status = 3;
                conditionC.signalAll();
            } catch (final InterruptedException e) {
                e.printStackTrace();
            } finally {
                lock.unlock();

            }
        });

        final Thread threadC = new Thread(() -> {
            lock.lock();
            try {
                while (status != 3) {
                    conditionC.await();
                }
                System.out.println("C");
                status = 1;
                conditionA.signalAll();
            } catch (final InterruptedException e) {
                e.printStackTrace();
            } finally {
                lock.unlock();

            }
        });
        final Thread[] threadsA = new Thread[5];
        final Thread[] threadsB = new Thread[5];
        final Thread[] threadsC = new Thread[5];
        for (int i = 0; i < 5; i++) {
            threadsA[i] = new Thread(threadA);
            threadsB[i] = new Thread(threadB);
            threadsC[i] = new Thread(threadC);
            threadsA[i].start();
            threadsB[i].start();

            threadsC[i].start();
        }
    }
}
