package com.marcus.oca.joanna;

/**
 * @author marcus
 */

public class TestClass {
    public static void main(String[] args) {


        int[] arr = {1, 2, 3, 4, 5, 6};
        int counter = 0;
        for (int value : arr) {
            if (counter >= 5) {
                break;
            } else {
                continue;
            }

   //         counter++;
        }
        System.out.println(arr[counter]);
    }

}