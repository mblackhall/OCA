package com.marcus.oca.loops;

/**
 * @author marcus
 */
public class ThreeComponents {

    public static void main(String[] args) {

        for( int i= 5,j=6,z=0; i > 5 && j > 6; System.out.println(z),z++,i++,j++){

            if (z == 10){
                j = 1;
            }
            System.out.println(i);

        }



    }
}
