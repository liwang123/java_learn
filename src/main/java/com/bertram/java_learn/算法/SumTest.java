package com.bertram.java_learn.算法;

import org.apache.commons.lang3.StringUtils;

/**
 * 两个字符串之和
 *
 */
public class SumTest {
    private static String sum="";
    public static void main(String[] args) {
        String a="321";
        System.out.println(a.toCharArray());
    }

    private static void getSum(String str1,String str2){
            int i=str1.length()-1,j=str2.length()-1,index=0;
        StringBuilder ans = new StringBuilder();
        while (i>=0||j>=0||index!=0){
                int x=i>=0?str1.charAt(i)-'0':0;
                int y=j>=0?str2.charAt(j)-'0':0;
                int result=x+y+index;
                ans.append(result%10);
                index=result/10;
                i--;
                j--;
            }
        ans.reverse();
    }
}


