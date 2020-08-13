package com.bertram.java_learn.collection;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author wang
 * @date 2020/8/11 15:27
 */
public class ListTest {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        Iterator<String> iterator = list.iterator();
        Iterator<String> iterator1 = list.iterator();
        iterator.next();
        iterator.remove();
        iterator.next();
        iterator1.next();
        Thread thread = new Thread(() -> {

        });
    }
}
