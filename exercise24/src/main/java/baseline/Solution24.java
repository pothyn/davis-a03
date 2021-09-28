/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Hunter Davis
 */

//        Enter two strings and I'll tell you if they are anagrams:
//        Enter the first string: note
//        Enter the second string: tone
//        "note" and "tone" are anagrams.

package baseline;

import java.util.HashMap;
import java.util.Scanner;

public class Solution24 {

    private static final Scanner in = new Scanner(System.in);

    private boolean isAnagram(String word1, String word2) {

        // Check if words are not the same length
        if (word1.length() != word2.length())
            return false;

        // Hashmaps for each string
        HashMap<Character, Integer> frequency1 = new HashMap<>();
        HashMap<Character, Integer> frequency2 = new HashMap<>();

        for (int i = 0; i < word1.length(); i++) {
            char char1 = word1.charAt(i);
            char char2 = word2.charAt(i);

            if (frequency1.containsKey(char1)) {
                frequency1.put(char1, frequency1.get(char1) + 1);
            }
            else {
                frequency1.put(char1, 1);
            }

            if (frequency2.containsKey(char2)) {
                frequency2.put(char2, frequency2.get(char2) + 1);
            }
            else {
                frequency2.put(char2, 1);
            }
        }

        return frequency1.equals(frequency2);

    }

    public static void main(String[] args) {

        // Initialization
        String word1;
        String word2;
        boolean isAnagram;
        Solution24 app = new Solution24();

        // Input
        System.out.println("Enter two strings and I'll tell you if they are anagrams:");
        System.out.print("Enter the first string: ");
        word1 = in.next();
        System.out.print("Enter the second string: ");
        word2 = in.next();

        isAnagram = app.isAnagram(word1, word2);

        // Result statements
        if(isAnagram)
            System.out.printf("\"%s\" and \"%s\" are anagrams.", word1, word2);
        else
            System.out.printf("\"%s\" and \"%s\" are not anagrams.", word1, word2);
    }
}
