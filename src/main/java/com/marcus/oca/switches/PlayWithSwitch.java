package com.marcus.oca.switches;

/**
 * @author marcus
 */
public class PlayWithSwitch {

    public static void main(String[] args) {

        int i = 1;

        // ? what gets printed

        mylabel:
        switch (i) {

            default:
                System.out.println("default entered");
            case 2:
                System.out.println("case 2");
                break;
            case 3:
                System.out.println("case 3");
                break;
        }

        // what is legal for the case ?

        final String myvar = "test"; // important that  it is final
        String str = "aaa";


        switch (str){

            case myvar :

        }

    }
}
