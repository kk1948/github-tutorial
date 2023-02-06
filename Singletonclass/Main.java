package Singletonclass;


import Access.A;

public class Main {
    public static void main(String[] args) {
        Singleton obj = Singleton.getInstance();

        Singleton obj1 = Singleton.getInstance();


        A a =new A(10, "kishan");
        System.out.println(a.getNum());//a.getNum();

    }
}
