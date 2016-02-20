package com.marcus.oca.arrays;

import java.util.Arrays;

/**
 * @author marcus
 */
public class CopyArrays {

    public static void main(String[] args) {

        int[] a = {1, 2, 3};
        int b[];

     //   System.out.println(b[1]);  // compiler error
        System.out.println(a[3]); // runtime error
        b = Arrays.copyOf(a, 5);  // copy needs lenght of new array
        int[] c = new int[3];
        c = Arrays.copyOf(a, 9); //ok
        c = Arrays.copyOf(a, 1); //ok
        //  int i = c[2]; // compile does not complain;








    }
}
