package com.marcus.oca.exceptions;

/**
 * @author marcus
 */
public class Overflow {


    public static void main(String[] args) {
      StackOverflowError x = new StackOverflowError();
        System.out.println(" is throwable " + (x instanceof Throwable));
        System.out.println(" is throwable " + (x instanceof Error));
        //System.out.println(" is throwable " + (x instanceof Exception)); // compiler knows


        loop();
    }

    private static void loop() {
        loop();
    }
}
