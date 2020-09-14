package com.bertram.java_learn.算法;

public class QuickSortTest {
    public static void main(String[] args) {
        int[] arr=new int[]{1,3,2,8,5};
        int[] ints = quickSort(arr, 0, arr.length - 1);
        System.out.println(ints);
    }
    public static int[] quickSort(int[] arr,int left,int right){
        if(left<right){
            int partitionIndex=partition(arr,left,right);
            quickSort(arr,left,partitionIndex-1);
            quickSort(arr,partitionIndex+1,right);
        }
        return  arr;
    }

    public  static int partition(int[] arr,int left,int right){
        //设定基准值
        int pivot=left;
        int index=pivot+1;
        for(int i=index;i<=right;i++){
            if(arr[i]<arr[pivot]){
                swap(arr,i,index);
                index++;
            }
        }
        swap(arr,pivot,index-1);
        return index-1;
    }

    private static void swap(int[] arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }

}
