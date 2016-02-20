package com.marcus.oca.strings;

/**
 * @author marcus
 */
public class CompErrors {


    public static void main(String[] args) {

        String s;
        int i = 5;
        if ( i == 5){
            s = "aaa";
        } else {
            if ( i == 6 ) {
                s = "bbb";
            } else {
                s = "default";
            }
        }

        System.out.println(s);

    }
}
