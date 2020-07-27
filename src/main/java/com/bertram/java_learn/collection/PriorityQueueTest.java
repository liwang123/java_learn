package com.bertram.java_learn.collection;

import java.util.Iterator;
import java.util.PriorityQueue;

/**
 * @author wang
 * @date 2020/7/24 10:15
 */
public class PriorityQueueTest {
    public static void main(final String[] args) {
        final PriorityQueue<Integer> queue = new PriorityQueue<>(3);

        queue.add(2);
        queue.add(3);
        queue.offer(4);
        queue.offer(2);
        queue.add(1);
        final Iterator<Integer> iterator = queue.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println(queue.peek());
    }
}
