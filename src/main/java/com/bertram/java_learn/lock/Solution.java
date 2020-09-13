package com.bertram.java_learn.lock;

public class Solution {
    public static void main(String[] args) {
        String a="abcd";
        String b="abcdf";
        char theDifference = findTheDifference(a, b);
        System.out.println(theDifference);
    }
    public static char findTheDifference(String s, String t) {
        int res = 0;
        for (char c : s.toCharArray()) {
            res ^= c;
        }
        for (char c : t.toCharArray()) {
            res ^= c;
        }
        return (char) res;
    }


}
