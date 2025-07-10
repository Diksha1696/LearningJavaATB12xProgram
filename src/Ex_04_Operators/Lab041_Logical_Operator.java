package Ex_04_Operators;

public class Lab041_Logical_Operator {
    public static void main(String[] args) {
        boolean a = true;
        System.out.println(!a);  // output -> false

        boolean b = true;
        System.out.println(!!b); // output-> true

        boolean c = true || false;
        System.out.println(c); // output -> true

        boolean d = false && true;
        System.out.println(d); // output - false
    }
}
