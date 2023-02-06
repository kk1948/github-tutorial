package abstractDemo;

public class Main {

     public static void main(String[] args) {
        Son son = new Son(28);
        son.carrer();
       // son.Partner();
         Parent.hello();
         son.normal();

        Daughter daughter = new Daughter(24);
        daughter.carrer();
        //daughter.Partner();
    }
}
