package JavaProgramsTest;

import java.util.Scanner;

public class StringPalindromeTest {
    public static void main(String []args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string");
        String str = input.nextLine();
        StringBuffer sbuffer = new StringBuffer(str);
        sbuffer.reverse();
        String reverse = sbuffer.toString();
        if(str.equals(reverse)) {
            System.out.println("Enterd string "+str+" is palindrome");
        } else {
            System.out.println("Enterd string "+str+" is not palindrome");
        }

    }
}
