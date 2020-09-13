package com.bertram.java_learn.算法;

import com.google.common.collect.Lists;
import com.google.common.collect.Sets;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

public class MaxSubarray {
    /**
     * 最大子序和
     * @param
     * @return
     */

    public static void main(String[] args) {
        int[] dp=new int[]{1,2,-2,4,-2};
        System.out.println(maxSubArray(dp));
    }

    public static int maxSubArray(int[] nums) {
        Set<Integer> set = Sets.newConcurrentHashSet();
        if(nums.length==0){
            return 0;
        }
        int len=nums.length;
        int max=nums[0];
        int[] dp =new int[len];
        dp[0]=nums[0];
        for(int i=1;i<len;i++){
            if(nums[i]+dp[i-1]>nums[i]){
                dp[i]=nums[i]+dp[i-1];
                set.add(nums[i]);
            }else {
                dp[i]=nums[i];
                set=Sets.newConcurrentHashSet();
            }
            if(dp[i]>=max){
                max=dp[i];
                set.add(nums[i]);
            }
        }
        return max;
    }
}
