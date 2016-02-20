package com.marcus.oca.arrays;

/**
 * @author marcus
 */
public class CheckArrays {

    public static void main(String[] args) {

        int[] a[];
        int b[][];
        int[][] c = new int[2][]; // left index must be given
        // int [][] d = new int [][4];  // not allowed

        c[0] = new int[]{1, 2, 3};
        c[1] = new int[]{1, 2, 3, 4, 5};  /// can contain more elements
        int x = c[0][2];


        // can use in enhanced for loop
        for (int y[] : c) {     // will go through all c.length (ie 0,1 arrays )
            System.out.println(y.toString());  // arrays are objects !

        }

        // out of index ....
        try {
            System.out.println(c[3]);
        } catch (ArrayIndexOutOfBoundsException e) {  // is an IndexOutOfBoundsException !
            e.printStackTrace();

        } catch (IndexOutOfBoundsException e) {  // is an IndexOutOfBoundsException !
            e.printStackTrace();
        }


    }
}
