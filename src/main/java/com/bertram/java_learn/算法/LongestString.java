package com.bertram.java_learn.算法;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 * 不重复最长自字符串
 */
public class LongestString {
    private static Set<Character> set=new TreeSet<>();

    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring(""));
        System.out.println(set.toString());
    }
    public static int lengthOfLongestSubstring(String s) {
        if(s.length()==0){
            return 0;
        }

        int j = 0,max=0;
        char[] str=s.toCharArray();
        for(int i=0;i<str.length;i++){
            if(!set.contains(str[i])){
                set.add(str[i]);
                max=Math.max(max,set.size());
            }else{
                while(set.contains(str[i])){
                    set.remove(str[j]);
                    j++;
                }
                set.add(str[i]);
            }
        }
        return max;
    }
}
