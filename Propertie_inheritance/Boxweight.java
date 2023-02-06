package Propertie_inheritance;

public class   Boxweight extends Box{
     double  weight;

    public  Boxweight(){
        this.weight = -2;
    }



    public Boxweight(Boxweight side) {
        super(side);
    }

    public Boxweight(double l, double w, double h, double weight) {

       super(l, w, h); // here super is calling the parent class constructor which have l,w,h field initialized
        // it is used to initialize value present in super class
        this.weight = weight;
//        System.out.println(super.weight);
    }
}
