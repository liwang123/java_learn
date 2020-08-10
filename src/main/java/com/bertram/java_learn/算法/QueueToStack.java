package com.bertram.java_learn.算法;

import java.util.LinkedList;
import java.util.Queue;

public class QueueToStack {
    private Queue<Integer> q1=new LinkedList<>();
    private Queue<Integer> q2=new LinkedList<>();

    public QueueToStack(){}
    //队列模拟栈

    public void push(int x){
        q1.offer(x);
        while (!q2.isEmpty()){
            q1.offer(q2.poll());
        }
        Queue tmp=q1;
        q1=q2;
        q2=tmp;
    }

    public int pop(){
        return q2.poll();
    }

    public int top(){
        return  q2.poll();
    }
    public boolean isEmpty(){
        return q1.isEmpty()&&q2.isEmpty();
    }
}
