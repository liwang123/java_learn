package com.bertram.java_learn.collection;

import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 * @author wang
 * @date 2020/8/4 16:21
 */
public class TreeSetTest {
    public static void main(final String[] agrs) {
        final TreeSet<String> treeSet = new TreeSet<>();
        System.out.println("TreeSet初始化容量大小：" + treeSet.size());

        //元素添加：
        treeSet.add("my");
        treeSet.add("name");
        treeSet.add("jiaboyan");
        treeSet.add("hello");
        treeSet.add("world");
        treeSet.add("1");
        treeSet.add("2");
        treeSet.add("3");
        System.out.println("TreeSet容量大小：" + treeSet.size());
        System.out.println("TreeSet元素顺序为：" + treeSet.toString());

        //增加for循环遍历：
        for (final String str : treeSet) {
            System.out.println("遍历元素：" + str);
        }

        //迭代器遍历：升序
        final Iterator<String> iteratorAesc = treeSet.iterator();
        while (iteratorAesc.hasNext()) {
            final String str = iteratorAesc.next();
            System.out.println("遍历元素升序：" + str);
        }

        //迭代器遍历：降序
        final Iterator<String> iteratorDesc = treeSet.descendingIterator();
        while (iteratorDesc.hasNext()) {
            final String str = iteratorDesc.next();
            System.out.println("遍历元素降序：" + str);
        }

        //元素获取:实现NavigableSet接口
        final String firstEle = treeSet.first();//获取TreeSet头节点：
        System.out.println("TreeSet头节点为：" + firstEle);

        // 获取指定元素之前的所有元素集合：(不包含指定元素)
        final SortedSet<String> headSet = treeSet.headSet("jiaboyan");
        System.out.println("jiaboyan节点之前的元素为：" + headSet.toString());

        //获取给定元素之间的集合：（包含头，不包含尾）
        final SortedSet subSet = treeSet.subSet("1", "world");
        System.out.println("1--jiaboan之间节点元素为：" + subSet.toString());

        //集合判断：
        final boolean isEmpty = treeSet.isEmpty();
        System.out.println("TreeSet是否为空：" + isEmpty);
        final boolean isContain = treeSet.contains("who");
        System.out.println("TreeSet是否包含who元素：" + isContain);

        //元素删除：
        final boolean jiaboyanRemove = treeSet.remove("jiaboyan");
        System.out.println("jiaboyan元素是否被删除" + jiaboyanRemove);

        //集合中不存在的元素，删除返回false
        final boolean whoRemove = treeSet.remove("who");
        System.out.println("who元素是否被删除" + whoRemove);

        //删除并返回第一个元素：如果set集合不存在元素，则返回null
        final String pollFirst = treeSet.pollFirst();
        System.out.println("删除的第一个元素：" + pollFirst);

        //删除并返回最后一个元素：如果set集合不存在元素，则返回null
        final String pollLast = treeSet.pollLast();
        System.out.println("删除的最后一个元素：" + pollLast);


        treeSet.clear();//清空集合:
    }
}
