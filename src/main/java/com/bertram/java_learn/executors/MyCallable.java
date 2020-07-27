package com.bertram.java_learn.executors;

import java.util.concurrent.Callable;

/**
 * @author wang
 * @date 2020/7/24 11:00
 */
public class MyCallable implements Callable<String> {
    @Override
    public String call() throws Exception {
        Thread.sleep(1000);
        //返回执行当前 Callable 的线程名字
        return Thread.currentThread().getName();
    }
}
