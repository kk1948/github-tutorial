package Singletonclass;

import Access.A;

public class Subclass extends A {
    public Subclass(int num, String name) {
        super(num, name);
    }

    public static void main(String[] args) {
        Subclass obj1 = new Subclass(23, "Nikhil Rai");
       int var = obj1.num;
    }
}

class Subsubclass extends Subclass {
    public Subsubclass(int num, String name) {
        super(num, name);
    }

    public static void main(String[] args) {
        Subsubclass obj2 = new Subsubclass(23, "Nikhil Rai");
        int var =  obj2.num;
    }
}