package com.bertram.java_learn.executors;

import com.google.common.collect.Lists;
import org.slf4j.helpers.FormattingTuple;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Test {
    static int price[] = {2,3,5,6};
    static int res = 0;
    public static void main(String[] args) {

        //Tuple aa = new Tuple;
        int sum = 0;
        int now = 0;
//        List

        asd(sum,Integer.MIN_VALUE);
    }
    public static void asd(int sum, int now) {
        for (int i = 0 ; i < price.length; i++ ) {
            if(price[i] < now)
                continue;

            sum +=  price[i];
            if(sum == 10){
                res++;
                sum -= price[i];
                return;
            }else if(sum < 10) {
                asd(sum, price[i]);
            }else {
                sum -= price[i];
                return;
            }
            sum -= price[i];
        }
    }
}
