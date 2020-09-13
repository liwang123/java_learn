package com.bertram.java_learn.lock;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author wang
 * @date 2020/9/10 16:04
 */
public class CountDownLatch1 {
    private static volatile int num = 1;

    public static void main(String[] args) throws InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(200);
        for (int i = 0; i < 100; i++) {
            final int threadNum = i;
            executorService.execute(() -> {
                try {
                    test(threadNum);
                } finally {
                }
            });
        }
        executorService.shutdown();
        System.out.println("final");
    }

    public static void test(final int i) {
        System.out.println(i);
    }
}
