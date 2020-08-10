package com.bertram.java_learn.executors;

import com.google.common.collect.Lists;

import java.util.List;

/**
 * @author wang
 * @date 2020/7/24 11:19
 */
public class ThreadLocalTest {
    private final List<String> messages = Lists.newArrayList();

    public static final ThreadLocal<ThreadLocalTest> holder = ThreadLocal.

            withInitial(ThreadLocalTest::new);

    public static void add(final String message) {
        holder.get().messages.add(message);
    }

    public static List<String> clear() {
        final List<String> messages = holder.get().messages;
        holder.remove();

        System.out.println("size: " + holder.get().messages.size());
        return messages;
    }

    public static void main(final String[] args) {
        ThreadLocalTest.add("一枝花算不算浪漫");
        System.out.println(holder.get().messages);
        ThreadLocalTest.clear();
    }
}
