package com.marcus.oca.exceptions;

import java.util.Scanner;

/**
 * @author marcus
 */
public class CommonExceptions {

    public static void main(String[] args) {


            arrayNullPointerError();
            arrayIndexError();
            classCastException();
            illegalArgumentException(-1);
            illegalStateException();
            numberFormatException();


    }

    private static void numberFormatException() {
        try {
            Integer.parseInt("aa");
        } catch(Exception e){
            reportError(e);
        }
    }

    private static void illegalStateException() {

        Scanner scanner = new Scanner("here is my String");
        scanner.useDelimiter(" ");
        while(scanner.hasNext()){
            System.out.print(scanner.next());

        }
        scanner.close();
        try {
            scanner.next();
        }catch(Exception e){
            reportError(e);
        }
    }

    private static void illegalArgumentException(int  arg) {

        try {
            throw new IllegalArgumentException("arg must be > 0");
        } catch (Exception e){
            reportError(e);
        }



    }

    private static void classCastException() {


         A a = new C();

         // A could be a B or C so compiler allows it !
        try {
            B b = (B) a;  // runtime error
        } catch(Exception e){
            reportError(e);
        }




    }

    static  void arrayNullPointerError (){
        try {
            int[] arr = null;
            int x = arr[5];
        }catch(RuntimeException e ){
            reportError(e);
        }

    }


    private static void reportError(Exception e) {
        System.out.println(e.getClass());


    }

    static  void arrayIndexError (){

        int [] arr = new int[]{1,2,3};
     try {
         int x = arr[5];
     }catch (Exception e){
         reportError(e);
     }

    }


}
class A {

}
class B extends A{

}
class C extends A{

}