package com.marcus.oca.joanna;

/**
 * @author marcus
 */
public class ArrayCopy {

    public static void main(String[] args) {

        int[] scores = { 1, 2, 3, 4, 5, 6};

        // from 2nd element copy in 2 elements to position 3
        // so 1,2,  elements 3,4  to scores 3
        // 1,2,3,3,4,6

        //      src,startpos,destination,length (no of elements to copy
        System.arraycopy(scores, 2, scores, 3, 2);
        for(int i :  scores) System.out.print(i);

    }
}
