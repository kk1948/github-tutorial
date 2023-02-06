
package Propertie_inheritance;

public class Box {
    double l;
    double w;
    double h;

    //double weight;



    Box() {
      //  super();  here super class is calling object class
        this.l = -3;
        this.h = -3;
        this.w = -3;
    }

    // cube
    Box(double side) {
        this.l = side;
        this.h = side;
        this.w = side;
    }

    public  Box(double l, double w, double h) {
        this.l = l;
        this.w = w;
        this.h = h;
    }

    Box(Box old ){
        this.l = old.l;
        this.h = old.h;
        this.w = old.w;
    }
}
