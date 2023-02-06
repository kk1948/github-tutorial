package abstractDemo;

 public  abstract class Parent {

    // local variable
     int age;

     //this is a parent class constructor
    public Parent(int age)  {
        this.age = age;
    }

    // this is a static method
    static void hello(){
        System.out.println("How you doing");
    }

    // normal method
    void  normal(){
        System.out.println("this is a normal method");
    }


    abstract void carrer();
    abstract void Partner();
}
