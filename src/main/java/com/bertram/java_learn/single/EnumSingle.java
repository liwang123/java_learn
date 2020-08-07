package com.bertram.java_learn.single;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author wang
 * @date 2020/8/6 16:39
 */
public enum EnumSingle {
    INSTANCE;
    private final AtomicInteger id = new AtomicInteger();

    public Integer get() {
        return this.id.incrementAndGet();
    }
}
