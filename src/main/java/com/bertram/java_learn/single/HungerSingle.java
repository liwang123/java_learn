package com.bertram.java_learn.single;

/**
 * @author wang
 * @date 2020/8/6 16:25
 */
public class HungerSingle {
    private static final HungerSingle HUNGER_SINGLE = new HungerSingle();

    private HungerSingle() {
    }

    public static HungerSingle getHungerSingle() {
        return HUNGER_SINGLE;
    }
}
