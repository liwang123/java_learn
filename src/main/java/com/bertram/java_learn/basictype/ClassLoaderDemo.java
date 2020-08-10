package com.bertram.java_learn.basictype;

/**
 * @author wang
 * @date 2020/7/29 15:31
 */
public class ClassLoaderDemo {
    public static void main(final String[] args) throws ClassNotFoundException {
        System.out.println("ClassLodarDemo's ClassLoader is " + ClassLoaderDemo.class.getClassLoader());
        System.out.println("The Parent of ClassLodarDemo's ClassLoader is " + ClassLoaderDemo.class.getClassLoader().loadClass(""));
        System.out.println("The GrandParent of ClassLodarDemo's ClassLoader is " + ClassLoaderDemo.class.getClassLoader().getParent().getParent());
    }
}
