package com.bertram.java_learn.collection;

/**
 * @author wang
 * @date 2020/8/10 11:08
 */
public class DoubleArray {
    public static void main(String[] args) {
        String[][] strings = new String[10][];
        String[] split = "1,2,3,4".split(",");
        strings[1] = split;
        String[] split1 = "2,6,7,8".split(",");
        strings[0] = split1;
        for (String[] string : strings) {
            for (String s : string) {
                System.out.print(s);
            }
        }
    }
}
