package com.bertram.java_learn.算法;

import java.util.Arrays;

/**
 * 冒泡
 */
public class MaoPaoTest {
    public static void main(String[] args) {
            int[] arr=new int[]{1,2,6,5};
        int[] ints = reverArray(arr);
        System.out.println(ints);

        System.out.println(5%1000000007);
    }

    public static int[] reverArray(int[] arr){
        for(int i=1;i<arr.length;i++){
            boolean flag=true;
            for(int j=0;j<arr.length-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    flag=false;
                }
            }
            if(flag){
                break;
            }
        }
        return arr;
    }
}
