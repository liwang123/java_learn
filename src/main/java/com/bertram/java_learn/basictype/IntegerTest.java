package com.bertram.java_learn.basictype;

/**
 * @author wang
 * @date 2020/7/28 15:55
 */
public class IntegerTest {
    public static void main(final String[] args) {
        final Integer i1 = 40;
        final Integer i2 = 40;
        final Integer i3 = 0;
        final Integer i4 = new Integer(40);
        final Integer i5 = new Integer(40);
        final Integer i6 = new Integer(0);

        System.out.println("i1=i2   " + (i1 == i2));//true
        System.out.println("i1=i2+i3   " + (i1 == i2 + i3)); //true
        System.out.println("i1=i4   " + (i1 == i4));//false
        System.out.println("i4=i5   " + (i4 == i5));//false
        System.out.println("i4=i5+i6   " + (i4 == i5 + i6));//true
        System.out.println("40=i5+i6   " + (40 == i5 + i6));//true

    }
}
