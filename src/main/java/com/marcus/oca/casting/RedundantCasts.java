package com.marcus.oca.casting;

/**
 * @author marcus
 */

class Bike {

}

class MountainBike extends Bike {

}

class Tricycle extends Bike {

}
public class RedundantCasts {

    int s;
    String b;
    public static void main(String[] args) {
     RedundantCasts aa =   new RedundantCasts();

        String c ;

        if (aa.s == 0 ){
            c = "aaa";
        } else {
            if ( aa.s == 1) {
                c = "bbb";
            }
        }


        System.out.println(aa.s);

        Bike b = new MountainBike();
        MountainBike mb = new MountainBike();
        MountainBike mb2 = (MountainBike) mb; // fine but not needed
        MountainBike mb3 = (MountainBike)  b;  // yes and no runtime error
        Tricycle t = (Tricycle) b;  // runtime error but not compile error




    }
}
