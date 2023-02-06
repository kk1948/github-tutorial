package Propertie_inheritance;

public class Main
{
    public static void main(String[] args)
    {
//        Box obj = new Box(3,6,7);
//        System.out.println(obj.l + " " + obj.h + " " + obj.w);
//        Box obj1 = new Box(3);
//        System.out.println(obj1.l + " " + obj1.h + " " + obj1.w);

        Boxweight box1 = new Boxweight();
//        Boxweight box2 = new Boxweight(7);
        System.out.println(box1.l+" "+box1.h+" "+box1.w+" "+ box1.weight);
//        System.out.println(box2.l+" "+box2.w+" "+box2.h);
        Boxweight box2 = new Boxweight(2,4,6,8);
        System.out.println(box2.l+" "+box2.h+" "+ box2.w+" "+ box2.weight);
//        System.out.println(box1.h +" "+ box1.weight );

//        Box box3 = new Boxweight(2,4,5,67);
//        System.out.println(box3.l);

        //there are many cariables in both parent and child class
        //you are given access to variables that are in ref type i.e. Boxweight
        //hence , you should have to access to weight variable
        //this also means, that the ones you are trying to access should be initialized
        //but here, when the object itself is of type parent class, how will you call the constructor of child class
//        Boxweight box4 = new Box(1,3,4);
//        System.out.println(box4.l);


    }
}
