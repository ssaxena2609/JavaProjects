package Fibonacci;

import java.util.Scanner;

public class FibonacciTest {
    static int limit;

    static int fibo(int number) {
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
        }


    public static void main(String []str) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Fibonacci Limit.");
        limit = sc.nextInt();

        for(int i=1; i<=limit; i++){
            System.out.print(fibo(i) +" ");
        }



    }
}
