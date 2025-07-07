package Ex_02_Java_Basics_Part2;

public class Lab024_printF {
    public static void main(String[] args) {
        int a = 10;
        System.out.println(a);
        System.out.printf("Your variable is %d",a);
        // %d -> int, byte,long,short
        // %s -> string
        // %f -> float,double
        // %b -> boolean

        int b = 20;
        System.out.printf("%d + %d",a,b);

    }
}
