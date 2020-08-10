package com.bertram.java_learn.atomic;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicIntegerArray;

/**
 * @author wang
 * @date 2020/7/23 16:17
 */
public class AtomicTest {
    public static void main(final String[] args) throws InterruptedException {
        final AtomicInteger atomicInteger = new AtomicInteger();
        atomicInteger.addAndGet(1);
        final AtomicIntegerArray atomicIntegerArray = new AtomicIntegerArray(10);

//        final AtomicStampedReference atomicStampedReference = new AtomicStampedReference();
//        atomicStampedReference.getReference();
        final CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        copyOnWriteArrayList.add("");
        copyOnWriteArrayList.get(1);

        final ArrayBlockingQueue arrayBlockingQueue = new ArrayBlockingQueue(100);
        arrayBlockingQueue.offer("");
        arrayBlockingQueue.poll();
        arrayBlockingQueue.put(1);
        final Object take = arrayBlockingQueue.take();

        final LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue(10);
        linkedBlockingQueue.take();
        linkedBlockingQueue.put(1);
    }
}
