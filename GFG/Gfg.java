package GFG;



public class Gfg {
    public static void main(String[] args) {
         box box1 = new box(5,7);
        System.out.println("length: "+ box1.lenth +"\n"+"breadth: "+ box1.breadth);

    }

}



class box{
    int lenth;
    int breadth;
    int height;


    public box(int length, int breadth) {
        this.lenth = length;
        this.breadth = breadth;
    }

    void method_1(){
        System.out.println();
    }

    //constructor chaining
    public box(int height) {
        this(4,8);
        this.height = height;
    }
}