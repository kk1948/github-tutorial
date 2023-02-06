package Staticexample;

public class Main {

    public static void main(String[] args) {
        Human Kishan = new Human(21,"kishan",50000, false);
        Human Nikhil = new Human(19,"Nikhil",44900,false);
        System.out.println(Human.population);
        System.out.println(Human.population);



        Main obj = new Main();
        obj.greeting();




    }

     static  int a = 10;
     int ab = 20;
      static void fun(){  // you cannot have non-statatic method and fields in static method
        // greeting(); non- static
        //  int z = ab; non - static

          // imp point you cannot acccess non- static stuff in static stuff without referencing their instances in static context
          // above example works fine bcoz we created an instances which references to it object
//          Main obj = new Main();
//          obj.greeting();

          System.out.println(a);
         System.out.println("kishan");
     }



      void greeting(){ // you can have static method  in non-static method and static field also
          fun(); // static method
          int b = a; // static field

          // non- static field
          int c = ab;
          System.out.println("Kishan");
      }
}
