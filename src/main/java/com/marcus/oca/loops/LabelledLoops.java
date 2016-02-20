package com.marcus.oca.loops;

/**
 * @author marcus
 */
public class LabelledLoops {

    public static void main(String[] args) {

        int[][] a = {
                {10, 5, 4},
                {1},
                {1, 2, 3, 4, 5},
                {}
        };
        m1:
        for (int i = 0; i < a.length; i++) {

            System.out.print("Array : " + i + " [ ");
            m2:
            for (int j = 0; j < a[i].length; j++) {
                if (a[i][j] == 5){
                    break m1;
                }
                System.out.print(a[i][j]);
                if (j != a[i].length - 1) {
                    System.out.print(",");
                }

            }
            System.out.println(" ]\n");
        }

        int b [] = {1,2};


    }
}
