package com.bertram.java_learn.single;

/**
 * @author wang
 * @date 2020/8/6 16:36
 */
public class DoubleCheckSingle {
    private DoubleCheckSingle() {
    }

    private static volatile DoubleCheckSingle doubleCheckSingle;

    public DoubleCheckSingle getDoubleCheckSingle() {
        if (doubleCheckSingle == null) {
            synchronized (DoubleCheckSingle.class) {
                if (doubleCheckSingle == null) {
                    doubleCheckSingle = new DoubleCheckSingle();
                }
            }
        }
        return doubleCheckSingle;
    }
}
