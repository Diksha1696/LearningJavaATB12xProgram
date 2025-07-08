package Ex_03_Literals;

public class Lab034_char_Literals {
    public static void main(String[] args) {
        char c1 = 'A'; //A-Z, a-z, $@@!$%%^&&)( - can be anything
        char c = "A"; //double quotes is not char , it is always string

        //java uses some escape char also
        char new_line = '\n';
        char tab_line = '\t';
        char back_space = '\b';
        char carriage_return = '\r';

        System.out.println("DikshaKumari");
        System.out.println("Diksha"+new_line+"Kumari"); // it will print Diksha and Kumari in 2 lines
    }
}
