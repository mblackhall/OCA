package com.marcus.oca.strings;

/**
 * @author marcus
 */
public class CheckMethods {

    public static void main(String[] args) {

        String s = "here is a string";
        System.out.println(s.substring(0,1).length());
        s.charAt(0);

        // string index out of bounds exception ...
        try {
            s.charAt(17);
        } catch (StringIndexOutOfBoundsException e){
            e.printStackTrace();
        } catch (IndexOutOfBoundsException e){  // is a !
            e.printStackTrace();
        }


        /// strings are final

        final String x = "s";
        // x = new String("blob"); cannot do;

        // string pool

        String p = "here is a string";
        System.out.println(s == p);   // yes because its in the string pooln

        String q = new String("here is a string");
        System.out.println(q == s);   // no its a new reference ..




    }
}
