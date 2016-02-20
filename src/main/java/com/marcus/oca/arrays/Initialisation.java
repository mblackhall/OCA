package com.marcus.oca.arrays;

/**
 * @author marcus
 */
public class Initialisation {

    // instance variables are all initialised to default values...
    //

    int [] a = new int[6] ;  // all 0
    int [] b;   // null

    public static void main(String[] args) {

       Initialisation i = new Initialisation();

        for(int item : i.a){
            System.out.println(item);
        }
        for (int item : i.b
             ) {

        }

        int c = i.b[0];  // no compile error but runtime exception

    }

     void mymethod(){
         int b [] ;
       //  b[0] = 1;  // here a compile error ... inside method
        int c[] = null;
         c[0] = 1;  // c now is initialised - you cant use it but its not a compiler error !
     }

}
