package math.problems;

import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        /*
         * Factorial of 5! = 5 x 4 X 3 X 2 X 1 = 120.
         * Write a java program to find Factorial of a given number using Recursion as well as Iteration.
         *
         */
        Scanner k = new Scanner(System.in);
        System.out.println("Enter any number: ");

        int num = k.nextInt();

        int factorialRec = factRec(num);
        System.out.println("Factorial of entered number using Recursion is: " + factorialRec);

        System.out.println();

        int factorialIt = factIt(num);
        System.out.println("Factorial of entered number using Iteration is: " + factorialIt);
    }

    static int factRec(int n) {
        int output;
        if (n == 1) {
            return 1;
        }
        output = factRec(n - 1) * n;
        return output;
    }

    static int factIt(int n) {
        int i, fact = 1;
        for (i = 1; i <= n; i++) {
            fact = fact * i;
        }
        return fact;
    }
}

