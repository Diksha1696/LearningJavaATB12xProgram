package Ex_04_Operators;

public class Lab038_Uranary_Operator {
    public static void main(String[] args) {
        //Unary Operator
        int a = +10; // +means positive operator
        int a1 = -110;
        int result = a+a1;
        System.out.println(a); //output will be 10 only
        System.out.println(a1); //output = -110
        System.out.println(result); // output = -100

        int b = -1;
        b= b+1;
        System.out.println(b); // output will be 0
    }
}
