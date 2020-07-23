package com.bertram.java_learn.lock;

/**
 * @author wang
 * @date 2020/7/23 15:04
 */
public class TheadTest {
    public static void main(final String[] args) {
        final ThreadLocal<Object> objectThreadLocal = new ThreadLocal<>();
        objectThreadLocal.get();
        objectThreadLocal.set("");
        objectThreadLocal.remove();
    }
}
