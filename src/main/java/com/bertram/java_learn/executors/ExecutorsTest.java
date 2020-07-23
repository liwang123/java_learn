package com.bertram.java_learn.executors;

import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadPoolExecutor;

/**
 * @author wang
 * @date 2020/7/23 10:54
 * 模拟线程池出现异常
 * 线程池出现异常怎么处理?
 * execute方式会抛出异常 submit不会抛出异常(future.get()可以获取手动捕捉异常)
 * 线程池会remove异常线程,然后addWorker
 * 不影响其他线程
 */
public class ExecutorsTest {
    public static void main(final String[] args) {
        final ThreadPoolTaskExecutor executorService = buildThreadPoolTaskExecutor();
        executorService.execute(() -> sayHi("execute"));
        final Future<?> submit = executorService.submit(() -> sayHi("submit"));
        try {
            final Object o = submit.get();
        } catch (final InterruptedException e) {
            e.printStackTrace();
        } catch (final ExecutionException e) {
            e.printStackTrace();
        }

    }

    private static void sayHi(final String name) {
        final String printStr = "【thread-name:" + Thread.currentThread().getName() + ",执行方式:" + name + "】";
        System.out.println(printStr);
        throw new RuntimeException(printStr + ",我异常啦!哈哈哈!");
    }

    private static ThreadPoolTaskExecutor buildThreadPoolTaskExecutor() {
        final ThreadPoolTaskExecutor executorService = new ThreadPoolTaskExecutor();
        executorService.setThreadNamePrefix("(公众号-why技术)-");
        executorService.setCorePoolSize(5);
        executorService.setMaxPoolSize(10);
        executorService.setQueueCapacity(1000);
        executorService.setKeepAliveSeconds(30);
        executorService.setRejectedExecutionHandler(new ThreadPoolExecutor.CallerRunsPolicy());
        executorService.initialize();
        return executorService;
    }
}
