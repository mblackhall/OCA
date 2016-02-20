package com.marcus.oca.strings;

/**
 * @author marcus
 */
public class Printing {

    public static void main(String[] args) {

        int a = 4, b =5;
        System.out.println(" text" + a + b);
        System.out.println(a + b + " text" + a + b);
        System.out.println("text" + a + a*b); // mult has higher priority


    }
}
