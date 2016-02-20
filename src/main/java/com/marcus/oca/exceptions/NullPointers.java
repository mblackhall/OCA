package com.marcus.oca.exceptions;

/**
 * @author marcus
 */
public class NullPointers {

    String str;

    public static void main(String[] args) {

        NullPointers n = new NullPointers();

        // comipiler does not lnow it is null but at runtime it abends...
        n.str.length();
    }
}
