package Ex_04_Operators;

public class Lab040_Operator_Relational {
    public static void main(String[] args) {
        // < less than
        // <= less than or equal to
        //> greater
        // >= greater or equal
        // == equal to
        // != not equal

        // All of them will always result in boolean

        int a = 10;
        int b = 30;
        boolean c = a>b;
        System.out.println(c);  // output - false

        int age_A = 33;
        int age_B = 34;
        boolean result = age_B >= age_B;
        System.out.println(result);  // output - true
    }
}
