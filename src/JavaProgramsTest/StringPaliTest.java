package JavaProgramsTest;

import java.util.Scanner;

public class StringPaliTest {



    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string to be tested");
        String str = sc.nextLine();
        char []ch = new char[str.length()];
        int j=0;
        boolean flag = true;
        for(int i=str.length()-1; i>=0; i--) {
            if(str.charAt(i) != str.charAt(j) ) {
                flag = false;
                break;
            }
                ++j;
           // flag = true;

        }
        if(flag) {
            System.out.println("Palindrome");
        }
        else {
                System.out.println(" Not Palindrome");
            }
        /*String strRev =  new String(ch);
        if(str.equals(strRev)) {
            System.out.println("Palindrome");
        } else {
            System.out.println(" Not Palindrome");

        }*/

    }
}
