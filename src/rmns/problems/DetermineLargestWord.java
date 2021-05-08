package rmns.problems;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class DetermineLargestWord {

    public static void main(String[] args) {
        /*
         Implement to Find the length and longest word in the given sentence below.
         Should return "10 biological".
         */
        String s = "Human brain is a biological learning machine";
        Map<Integer, String> wordNLength = findTheLargestWord(s);
        for (String word : wordNLength.values()) {
            s = word.length() + " " + word;
        }
        System.out.println(s);
    }

    public static Map<Integer, String> findTheLargestWord(String wordGiven) {
        Map<Integer, String> map = new HashMap<Integer, String>();
        String words[] = wordGiven.split(" ");
        String longestWord = words[0];
        for (int i = 1; i < words.length; i++) {
            if (words[i].length() > longestWord.length()) {
                longestWord = words[i];
            }
        }
        map.put(longestWord.length(), longestWord);
        return map;
    }
}
