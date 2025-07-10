package Ex_04_Operators;

public class Lab043_Interview_Concat_Plus {
    public static void main(String[] args) {
        String first_name = "Diksha";
        String last_name = "Kumari";

        int a = 10;
        int b = 10;

        System.out.println(first_name + last_name + a+b); //output = DikshaKumari1010
        System.out.println(a +b + first_name + last_name); // output = 20DikshaKumari
        System.out.println(first_name + last_name + (a+b)); // output = DikshaKumari30
    }
}

