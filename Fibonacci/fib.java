// Assignment 5
// Topic: Fibonacci Recursion.

import java.util.Scanner;

public class fib {
    public static int Fibonacci(int n) {
        if (n == 0) {
            return 0;

        } else if(n == 1) {
            return 1;

        } else {
            return Fibonacci(n-2) + Fibonacci(n-1);
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Input: ");
        int number = input.nextInt();

        System.out.print("Output: ");
        for(int i = 0; i <= number; i++) {
            System.out.print(Fibonacci(i) + " ");
        }
    }
}
