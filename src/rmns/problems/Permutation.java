package rmns.problems;

import java.util.Scanner;

public class Permutation {

    static void strPermutation(String str, String rslt) {
        if (str.length() == 0) {
            System.out.println(rslt + " ");
            return;
        }

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            String rmns = str.substring(0, i) + str.substring(i + 1);
            strPermutation(rmns, rslt + ch);
        }
    }

    public static void main(String[] args) {
        /*
         * Permutation of String "ABC" is "ABC" "BAC" "BCA" "ACB" "CAB" "CBA".
         * Write Java program to compute all Permutation of a String
         */

        Scanner k = new Scanner(System.in);

        System.out.println("Enter any String to compute all possible Permutations : ");
        String str = k.nextLine();

        System.out.println("\nAll possible Permutations are : \n");
        strPermutation(str, "");
    }
}
