package com.marcus.oca.loops;

/**
 * @author marcus
 */
public class PreAndPostIncrements {


    public static void main(String[] args) {

        int x = 0;
        int [] a = { 1,2};

        System.out.println(a[x++]);

        for (int i=0;i<10;i++){
            System.out.println(++i);

        }

        for (int i=0;i<10;i++){
            System.out.println(i++);

        }



    }
}
