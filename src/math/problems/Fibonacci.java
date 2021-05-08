package math.problems;

import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {
         /*
          Write 40 Fibonacci numbers with java.
          0,1,1,2,3,5,8,13
         */
        Scanner k = new Scanner(System.in);
        System.out.println("Enter any number: ");

        int num = k.nextInt();

        int firstTerm = 0, secondTerm = 1;

        System.out.println("\nFibonacci Series Up to " + num + ": \n");

        while (firstTerm <= num) {
            System.out.print(firstTerm + ", ");

            int nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;

        }
    }
}
