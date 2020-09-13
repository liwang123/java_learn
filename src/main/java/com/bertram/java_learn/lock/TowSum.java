package com.bertram.java_learn.lock;

public class TowSum {
    private static int max=Integer.MAX_VALUE;
    private static int first=0;
    private  static int second=0;
    public static void main(String[] args) {
        int[] arr=new int[]{1,2,3};
        int n=8;
        getArr(arr,3);
        System.out.println(first+":"+second);
    }
    private  static void getArr(int[] arr,int n ){
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                int i1 = n - arr[i] - arr[j];
                if(i1<0){
                    i1=-i1;
                }
                if(i1<max){
                    max=n-arr[i]-arr[j];
                    first=i;
                    second=j;
                }
            }
        }
    }
}
