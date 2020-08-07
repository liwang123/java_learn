package com.bertram.java_learn.single;

/**
 * @author wang
 * @date 2020/8/6 16:26
 */

public class SingleTest {
    public static void main(final String[] args) {
        final HungerSingle hungerSingle = HungerSingle.getHungerSingle();
        final HungerSingle hungerSingle1 = HungerSingle.getHungerSingle();
        System.out.println(hungerSingle);
        System.out.println(hungerSingle1);
        final LazySingle lazy = LazySingle.getLazy();
        final LazySingle lazy1 = LazySingle.getLazy();
        System.out.println(lazy);
        System.out.println(lazy1);
        final EnumSingle instance = EnumSingle.INSTANCE;
        final EnumSingle instance1 = EnumSingle.INSTANCE;
        System.out.println(instance);
        System.out.println(instance1);

    }
}
