package com.marcus.oca.arrays;

/**
 * @author marcus
 */
public class ArraysIsObject  {

    public static void main(String[] args) {

        int [] arr = new int [6] ;
        System.out.println(arr instanceof Object);
        //oke lets really check it
        // if it is an object it inherits all methods of Object

        System.out.println(" as string : "+  arr.toString() +"/n"  + "Length : " +arr.length +
         "\n" + "Class : " + arr.getClass().getSimpleName() );


    }
}
