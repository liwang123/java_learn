package com.bertram.java_learn.lock;

public class RecursionTest {
    static int n=5;
    public static void main(String[] args) {
        dfs();
        System.out.println(n);
    }
   static void  dfs(){
        if(n==0)return;
        n--;
        dfs();
    }
}
