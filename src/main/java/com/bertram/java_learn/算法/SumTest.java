package com.bertram.java_learn.算法;

import org.apache.commons.lang3.StringUtils;

public class SumTest {
    private static String sum="";
    public static void main(String[] args) {
        String a="321";
        System.out.println(a.toCharArray());
    }

    private static void getSum(String str1,String str2){
        if(StringUtils.isBlank(str1)){
            sum= str2;
        }
        if(StringUtils.isBlank(str2)){
            sum= str1;
        }
        char[] chars1 = str1.toCharArray();
        char[] chars2 = str2.toCharArray();
        //假设len1 长度大于len2
        int len1=chars1.length-1;
        int len2=chars2.length-1;
        int index=0;
        int count=0;
        for(int i=len1;i>=0;i--){
            if(i-len2<0){
                if(index>0){
                }
            }else {
                int num = chars1[i] + chars2[i]+index;
                int i2 = num / 10;
                if(i2==0){
                    index=0;
                }else {
                    int i1 = num % 10;
                    count=i1;
                    index=1;
                }
            }
        }

    }
}
