package com.marcus.oca.constructors;

// the super class
class Top {
    // instance ....
    {
        System.out.println("Instance top");
    }

    // static blocks ...
    static {
        System.out.println("Top static");
    }

    Top() {
        System.out.println("Top constructor");
    }

    void draw() throws Exception{

    }
}
// the subclass
class Bottom extends Top {
    {
        System.out.println("Instance bottom");
    }

    static {
        System.out.println("Bottomstatic");
    }

    Bottom() {
        System.out.println("constructor bottom");
    }

    void draw() throws RuntimeException{

    }
}


// test it
public class OrderOfThings {
    public static void main(String[] args) {

        new Bottom();
        new Bottom();
    }

}



