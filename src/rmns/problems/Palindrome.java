package rmns.problems;

import java.util.Scanner;

public class Palindrome {

    public static boolean isPalindrome(String str) {

        int i = 0, j = str.length() - 1;

        while (i < j) {
            if (str.charAt(i) != str.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
    }

    public static void main(String[] args) {
        /*
          If a String is reversed and it remains unchanged, that is called Palindrome. For example, MOM,DAD,MADAM are
          Palindrome. So write java code to check if a given String is Palindrome or not.
         */
        Scanner k = new Scanner(System.in);

        System.out.println("Enter any String to check if it is Palindrome : ");
        String str = k.nextLine();

        if (isPalindrome(str)) {
            System.out.println(str + " is Palindrome");
        } else {
            System.out.println(str + " is Not Palindrome");
        }
    }
}
