package abstractDemo;

public class Son extends Parent{

    public Son( int age) {
        super(age);
    }

    @Override
    void normal() {
        super.normal();
        System.out.println("this is a overridden of a normal method");


    }

    @Override
    void carrer() {
        System.out.println("I am going to be a coder");
    }

    @Override
    void Partner() {
        System.out.println("I love sushi");

    }
}
