/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 first_name last_name
 */

//        Enter two strings and I'll tell you if they are anagrams:
//        Enter the first string: note
//        Enter the second string: tone
//        "note" and "tone" are anagrams.

package baseline;

public class Solution24 {

    public static void main(String[] args) {

        String word1, word2;

        // Prompt user for two strings, asking if they are anagrams
        // Prompt and read string 1
        // Prompt and read string 2

        // If isAnagram(word1, word2)
            // Print "word1 and word2 are anagrams"
        // else
            // Print "word1 and word2 are not anagrams"
    }

    private boolean isAnagram(String word1, String word2) {

        char[] ch1, ch2;

        // Get lengths of strings
        // If string lengths not equal
            // return false

        ch1 = stringToChar(word1);
        ch2 = stringToChar(word2);
        // Sort ch1
        // Sort ch2

        // for each value of ch1
            // if ch1[i] = ch2[i]
                // return false

        return true;
    }

    private char[] stringToChar(String word) {

        char[] charArray = new char[word.length()];
        // Add all characters to new array

        return charArray;
    }
}
