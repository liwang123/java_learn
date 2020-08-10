package com.bertram.java_learn.executors;

import java.lang.reflect.Field;

/**
 * @author wang
 * @date 2020/7/24 11:30
 */
public class ThreadLocalDemo {
    public static void main(final String[] args) throws NoSuchFieldException, IllegalAccessException, InterruptedException {
        final Thread t = new Thread(() -> test("abc", false));
        t.start();
        t.join();
        System.out.println("--gc后--");
        final Thread t2 = new Thread(() -> test("def", true));
        t2.start();
        t2.join();
    }

    private static void test(final String s, final boolean isGC) {
        try {
            new ThreadLocal<>().set(s);
            if (isGC) {
                System.gc();
            }
            final Thread t = Thread.currentThread();
            final Class<? extends Thread> clz = t.getClass();
            final Field field = clz.getDeclaredField("threadLocals");
            field.setAccessible(true);
            final Object ThreadLocalMap = field.get(t);
            final Class<?> tlmClass = ThreadLocalMap.getClass();
            final Field tableField = tlmClass.getDeclaredField("table");
            tableField.setAccessible(true);
            final Object[] arr = (Object[]) tableField.get(ThreadLocalMap);
            for (final Object o : arr) {
                if (o != null) {
                    final Class<?> entryClass = o.getClass();
                    final Field valueField = entryClass.getDeclaredField("value");
                    final Field referenceField = entryClass.getSuperclass().getSuperclass().getDeclaredField("referent");
                    valueField.setAccessible(true);
                    referenceField.setAccessible(true);
                    System.out.println(String.format("弱引用key:%s,值:%s", referenceField.get(o), valueField.get(o)));
                }
            }
        } catch (final Exception e) {
            e.printStackTrace();
        }
    }
}
