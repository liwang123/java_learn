package com.bertram.java_learn.lock;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author wang
 * @date 2019/7/29 17:15
 */
public class OrderOut {
    /**
     * 线程按照顺序输出ABC
     */


    volatile static int status = 1;

    public static void main(final String[] args) {
        final ReentrantLock lock = new ReentrantLock();
        final Condition conditionA = lock.newCondition();
        final Condition conditionB = lock.newCondition();
        final Condition conditionC = lock.newCondition();

        final Thread threadA = new Thread() {
            @Override
            public void run() {
                lock.lock();
                try {
                    while (status != 1) {
                        conditionA.await();
                    }
                    System.out.println("A");
                    status = 2;
                    conditionB.signalAll();
                } catch (final Exception e) {

                } finally {
                    lock.unlock();
                }

            }
        };

        final Thread threadB = new Thread() {
            @Override
            public void run() {
                lock.lock();
                try {
                    while (status != 2) {
                        conditionB.await();
                    }
                    System.out.println("B");
                    status = 3;
                    conditionC.signalAll();
                } catch (final Exception e) {

                } finally {
                    lock.unlock();
                }

            }
        };

        final Thread threadC = new Thread() {
            @Override
            public void run() {
                lock.lock();
                try {
                    while (status != 3) {
                        conditionC.await();
                    }
                    System.out.println("C");
                    status = 1;
                    conditionA.signalAll();
                } catch (final Exception e) {

                } finally {
                    lock.unlock();
                }

            }
        };

        final Thread[] arrayA = new Thread[5];
        final Thread[] arrayB = new Thread[5];
        final Thread[] arrayC = new Thread[5];
        for (int i = 0; i < 5; i++) {
            arrayA[i] = new Thread(threadA);
            arrayB[i] = new Thread(threadB);
            arrayC[i] = new Thread(threadC);

            arrayA[i].start();
            arrayB[i].start();
            arrayC[i].start();
        }
    }
}
