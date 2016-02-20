package com.marcus.oca.casting;

/**
 * @author marcus
 */


class A {

}
class B extends A  {

}
class C extends A {

}

public class UpAndDown {

    public static void main(String[] args) {
        A a1 = new A();
        A a2= new B();

        B b1 = (B)a2; /// oke .. a2 is an instance of B
        B b = (B) new A();   // runtime error a is not an instance of B but thee is no compile error
        C c = (C) a2;  // clearly wrong but comiler says nothing. a2 could be a c !

        // so everthing is an object...i

        Object o = new String();

        //   ... so can i cast anobject to a string
        Integer s = (Integer) o;    // The object could be anything so  compiler accepts it but runtime its obviously wrong

    }
}
