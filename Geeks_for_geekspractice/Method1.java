package Geeks_for_geekspractice;

// interesting example of non primitive types

 class Point{int x , y;}
 public class Method1 {
     public static void main(String[] args) {
//         Point p = new Point();
//         p.x = 5; p.y = 10;
//         fun(p);
//         System.out.println(p.x +" "+ p.y);
//     }
//        public static  void fun(Point p){
//         p.x = 10; p.y = 10;

         // interesting example
            Point p = new Point();
            p.x = 5; p.y = 10;
            fun(p);
            System.out.println(p.x +" "+ p.y);
        }
         public static  void fun(Point p) {
          p = new Point(); // here creation of new object  and allocation of new values
             p.x = 10;        //in that object happens
             p.y = 10;
         }
}
