package com.bertram.java_learn.basictype;

/**
 * @author wang
 * @date 2020/7/28 15:51
 */
public class StringTest {
    public static void main(final String[] args) {
//        final String str1 = "abcd";//先检查字符串常量池中有没有"abcd"，如果字符串常量池中没有，则创建一个，然后 str1 指向字符串常量池中的对象，如果有，则直接将 str1 指向"abcd""；
//        final String str2 = new String("abcd");//堆中创建一个新的对象
//        final String str3 = new String("abcd");//堆中创建一个新的对象
//        System.out.println(str1 == str2);//false
//        System.out.println(str2 == str3);//false

        final String s1 = new String("计算机");
        final String s2 = s1.intern();
        final String s3 = "计算机";
        System.out.println(s2);//计算机
        System.out.println(s1 == s2);//false，因为一个是堆内存中的 String 对象一个是常量池中的 String 对象，
        System.out.println(s3 == s2);//true，因为两个都是常量池中的 String 对象


        final String str1 = "str";
        final String str2 = "ing";

        final String str3 = "str" + "ing";//常量池中的对象
        final String str4 = str1 + str2; //在堆上创建的新的对象
        final String str5 = "string";//常量池中的对象
        System.out.println(str3 == str4);//false
        System.out.println(str3 == str5);//true
        System.out.println(str4 == str5);//false
    }
}
