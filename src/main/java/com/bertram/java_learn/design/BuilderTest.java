package com.bertram.java_learn.design;

/**
 * @author wang
 * @date 2020/8/7 11:24
 */
public class BuilderTest {
    public static void main(final String[] args) {
        ResourceConfig build = new ResourceConfig.Builder().setMaxTotal(1).setName("123").build();
        System.out.println(build);

        ConstractorArg build1 = new ConstractorArg.Builder()
                .setIsRef(false)
                .setType(Integer.class)
                .setArg(123).build();
        System.out.println(build1);
    }
}
