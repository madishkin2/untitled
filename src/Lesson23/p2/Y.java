package Lesson23.p2;

//import Lesson23.p1.*;

import Lesson23.p1.X;

public class Y extends X {

    public void def () {
        System.out.println("Def iz classa Y");
    }

    public static void main(String[] args) {
        System.out.println("Y");
        Y y = new Y();
        X y1 = new Y();
        y.def();
        y1.def();

    }
}
