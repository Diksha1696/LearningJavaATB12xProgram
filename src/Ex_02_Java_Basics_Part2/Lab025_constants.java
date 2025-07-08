package Ex_02_Java_Basics_Part2;

public class Lab025_constants {
    public static void main(String[] args) {
        int a = 10;
        System.out.println(a); // JVM will never assign the local variable value

        final int b = 10;
       // b = 11; //java: cannot assign a value to final variable b
        System.out.println(b);

        final float PI = 3.14f;
        //PI = 2 // can't be changes
    }
}
