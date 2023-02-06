package Access;

public class ObjectDemo {

    int num;
    float gpa;
    public ObjectDemo(int num, float gpa) {
        this.num = num;
        this.gpa = gpa;
    }

    @Override
    public boolean equals(Object obj) {
        return this.num == ((ObjectDemo)obj).num;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }

    public static void main(String[] args) {
        ObjectDemo obj1 = new ObjectDemo(23, 35.56f);
        ObjectDemo obj2 = new ObjectDemo(23, 23.44f);

        if (obj1 == obj2) {   // here == operator checks whether obj1 is pointing to the same of obje
            System.out.println("Oobj1 == obj2");

        }

        if (obj1.equals(obj2)){ // here equals method is checking the content of obj1 & obj2
            System.out.println("Object1 is equals to object two");
        }
    }


}
