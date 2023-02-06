package Staticexample;

import java.util.Arrays;

public class Innerclasses {

      static  class Kishan{
        String name;
        public Kishan(String name) {
            this .name = name;
        }

    }

    public static void main(String[] args) {
         Kishan obj1 = new Kishan("kishan");

        System.out.println(obj1.name);
        Arrays.toString(new int[]{2,3,4});
    }


}

