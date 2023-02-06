package abstractDemo;

public class Daughter extends Parent{


    public Daughter(int age) {
       super(age );
    }

    @Override
    void carrer() {
        System.out.println("I am going to be a Teacher");
    }

    @Override
    void Partner() {
        System.out.println("I love painting");

    }
}
