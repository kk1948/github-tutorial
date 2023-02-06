package Staticexample;

  public class Staticblock {
    static  int a = 3;
    static  int b;

       //will run only once, when first object is created or we can say when class is loaded for first time
       static {
           System.out.println("Inside a static block");
            b = a * 3;
       }

    public static void main(String[] args) {

           Staticblock obj = new Staticblock();
          System.out.println(Staticblock.a +" "+ Staticblock.b);

          Staticblock.b += 3;
          Staticblock obj1 = new Staticblock();
        System.out.println(Staticblock.a +" "+ Staticblock.b);


    }
}
