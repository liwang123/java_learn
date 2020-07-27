package com.bertram.java_learn.executors;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author wang
 * @date 2020/7/24 11:05
 */
public class NamingThreadFactory implements ThreadFactory {
    private final AtomicInteger threadNum = new AtomicInteger();
    private final ThreadFactory delegate;
    private final String name;

    /**
     * 创建一个带名字的线程池生产工厂
     */
    public NamingThreadFactory(final ThreadFactory delegate, final String name) {
        this.delegate = delegate;
        this.name = name; // TODO consider uniquifying this
    }

    @Override
    public Thread newThread(final Runnable r) {
        final Thread t = this.delegate.newThread(r);
        t.setName(this.name + " [#" + this.threadNum.incrementAndGet() + "]");
        return t;
    }
}
