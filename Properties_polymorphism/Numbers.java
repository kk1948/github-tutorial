package Properties_polymorphism;

public class Numbers {

    public int sum(int a , int b){
        return a + b;
    }

    public int sum(int a , int b, int c){
        return a + b + c;
    }

    public static void main(String[] args) {

         Numbers num1 = new Numbers();
        System.out.println(num1.sum(39,85));
         num1.sum(47,894,48);
    }

}
