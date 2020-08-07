package com.bertram.java_learn.single;

/**
 * @author wang
 * @date 2020/8/6 16:31
 */
public class LazySingle {
    private LazySingle() {
    }

    private static class HolderSingle {
        private static final LazySingle lazySingle = new LazySingle();
    }

    public static LazySingle getLazy() {
        return HolderSingle.lazySingle;
    }
}
