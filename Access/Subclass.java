package Access;

public class Subclass  extends  A{
    public Subclass(int num, String name) {
        super(num, name);
    }

    public static void main(String[] args) {
        Subclass obj1 = new Subclass(23,"Nikhil Rai");
        int var = obj1.num;

        System.out.println(obj1 instanceof A); //checking obj1 is a instance of A or not
        System.out.println(obj1 instanceof Subclass);
        System.out.println(obj1.getClass().getName()); //when we getClass() information it will store in heap memory
    }
}
