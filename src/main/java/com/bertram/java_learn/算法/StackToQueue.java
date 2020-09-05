package com.bertram.java_learn.算法;

import java.util.Stack;

/**
 * @author wang
 * @date 2020/8/10 14:21
 */
public class StackToQueue {

    private Stack<Integer> s1 = new Stack<>();
    private Stack<Integer> s2 = new Stack<>();

    private int front;

    /**
     * 栈实现队列
     */
    public StackToQueue() {
    }

    public void push(int x) {
        if (this.s1.isEmpty()) {
            this.front = x;
        }
        this.s1.push(x);
    }

    public int poll() {
        if (this.s2.isEmpty()) {
            while (!this.s1.isEmpty()) {
                this.s2.push(this.s1.pop());
            }
        }
        return this.s2.pop();
    }


    public int peek() {
        if (!this.s2.isEmpty()) {
            return this.s2.peek();
        }
        return this.front;
    }

    public boolean isEmpty() {
        return this.s1.isEmpty() && this.s2.isEmpty();
    }

}
