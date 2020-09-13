package com.bertram.java_learn.executors;

import java.util.Observable;
import java.util.Observer;

public class User implements Observer {

    private String name;
    public User(String name){
        this.name=name;
    }
    @Override
    public void update(Observable o, Object arg) {
        System.out.println("内容"+name+"修改"+arg);
    }
}
