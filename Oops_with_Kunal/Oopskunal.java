package Oops_with_Kunal;

public class Oopskunal {
    public static void main(String[] args) {

        Student kishan = new Student();

        kishan.name = "kishan";
        kishan.marks = 95;
        kishan.age = 24;


        System.out.println(kishan);
        System.out.println(kishan.name);
        System.out.println(kishan.age);
        System.out.println(kishan.marks);
    }
}
//crates a class
// for every student1
 class Student {
    String name;
    int age;
    float marks;
 }