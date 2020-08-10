package com.bertram.java_learn.tree;

public class TreeNode {

    private int val;
    private TreeNode left;
    TreeNode right;

    TreeNode(int x){
        this.val=x;
    }

    public static void main(String[] args) {
        JumpFloor(3);
    }

    public static int JumpFloor(int target) {
        if(target==1){
            return 1;
        }
        if(target==2){
            return 2;
        }
        int[] ans=new int[target];
        ans[0]=0;
        ans[1]=1;
        ans[2]=2;
        for(int i=3;i<target;i++){
            ans[i]=ans[i-1]+ans[i-2];
        }
        return ans[target-1];
    }

}
