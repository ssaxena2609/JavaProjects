package Fibonacci;

import java.util.Scanner;

public class FibonacciTest {
    static int limit;

   /* static int fibo(int number) {
        if(number == 1 || number == 2){
            return 1;
        }
        int fibo1=1, fibo2=1, fibonacci=1;
        for(int i= 3; i<= number; i++){
            fibonacci = fibo1 + fibo2;
            fibo1 = fibo2;
            fibo2 = fibonacci;
        }
             return fibonacci;
        }*/


    public static void main(String []str) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Fibonacci Limit.");
        limit = sc.nextInt();
        int a = 1, b = 1, c;
        c = a + b;
        for (int i = 1; i <= limit; i++) {
            if (i == 1 || i == 2) {
                System.out.print("1 ");
            } else if(i==3) {
                System.out.print("2 ");
            } else {
                a = b;
                b = c;
                c = a + b;
                System.out.print(c + " ");
            }

        }
    }
}
