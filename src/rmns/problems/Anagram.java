package rmns.problems;

import java.util.Scanner;

public class Anagram {

    public static boolean isAnagram(String str1, String str2) {

        if (str1.length() != str2.length()) {
            System.out.println(str1 + " and " + str2 + " Have to be same Length In order to be An Anagram");
            return false;
        }

        int[] arrCount = new int[256];

        for (int i = 0; i < str1.length(); i++) {
            arrCount[str1.charAt(i)]++;
            arrCount[str2.charAt(i)]--;
        }

        for (int j = 0; j < arrCount.length; j++) {
            if (arrCount[j] != 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        //Write a Java Program to check if the two String are Anagram. Two String are called Anagram when there is
        //same character but in different order.For example,"CAT" and "ACT", "ARMY" and "MARY".

        Scanner k = new Scanner(System.in);

        System.out.println("Enter the First String");
        String str1 = k.nextLine();

        System.out.println("Enter the Second String");
        String str2 = k.nextLine();

        if (isAnagram(str1, str2)) {
            System.out.println(str1 + " and " + str2 + " Are An Anagram");
        } else {
            System.out.println(str1 + " and " + str2 + " Are Not An Anagram");
        }
    }
}
