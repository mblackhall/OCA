package com.marcus.oca.overloading;

/**
 * @author marcus
 */
class Mammal {

    void printDescription(){
        System.out.println("suckles young");
    }
}
class Human extends Mammal {

    void printDescription(){

        System.out.println("stands on two legs");
    }

    }

class Cat extends Mammal {

    void printDescription(){

        System.out.println("I've got four legs");
    }

}


public class Overloading {


    public void  info(Mammal m){
        System.out.println("in mammal method");
    }

    public void  info (Human h){
        System.out.println("In human methood");
    }

    public static void main(String[] args) {
        Mammal m = new Mammal();
        Mammal m2 = new Human();
        Human human = new Human();
        Mammal cat = new Cat();
        Overloading o = new Overloading();
        o.info(m2);  // which method...
        o.info(human);  // which method...
        // compile looks for match..
        o.info(cat);




    }
}
