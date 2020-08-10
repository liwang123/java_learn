package com.bertram.java_learn.算法;

import java.util.Stack;

public class StackToQueue {
    public StackToQueue(){}
    private Stack<Integer> s1=new Stack<>();
    private Stack<Integer> s2=new Stack<>();
    private int front;

    public void push(int x){
        if(s1.isEmpty()){
            front=x;
        }
        s1.push(x);
    }

    public int pop(){
        if (s2.isEmpty()){
            while (!s1.isEmpty()){
                s2.push(s1.pop());
            }
        }
        return s2.pop();
    }

    public int peek(){
        return  front;
    }

    public boolean isEmpty(){
        return s1.isEmpty()&&s2.isEmpty();
    }
}
