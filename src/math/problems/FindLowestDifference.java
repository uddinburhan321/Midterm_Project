package math.problems;

import java.util.Arrays;

public class FindLowestDifference {

    public static void main(String[] args) {
        /*
         Implement in java.
         Read this below two array. Find the lowest difference between the two array cell.
         The lowest difference between cells is 1
        */
        int[] array1 = {30, 12, 5, 9, 2, 20, 33, 1};
        int[] array2 = {18, 25, 41, 47, 17, 36, 14, 19};
        System.out.println("\nMinimum difference of first array is " + findMinDiff1(array1, array1.length));
        System.out.println("\nMinimum difference of second array is " + findMinDiff2(array2, array2.length));
    }

    static int findMinDiff1(int[] arr1, int n1) {
        Arrays.sort(arr1);
        int diff1 = Integer.MAX_VALUE;

        for (int i = 0; i < n1 - 1; i++)
            if (arr1[i + 1] - arr1[i] < diff1)
                diff1 = arr1[i + 1] - arr1[i];
        return diff1;
    }

    static int findMinDiff2(int[] arr2, int n2) {
        Arrays.sort(arr2);
        int diff2 = Integer.MAX_VALUE;

        for (int j = 0; j < n2 - 1; j++)
            if (arr2[j + 1] - arr2[j] < diff2)
                diff2 = arr2[j + 1] - arr2[j];
        return diff2;
    }
}
