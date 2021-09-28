/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Hunter Davis
 */

package baseline;

public class Solution25 {

//    Create a program that determines the complexity of a given password based on these rules:
//
//    A very weak password contains only numbers and is fewer than eight characters.
//    A weak password contains only letters and is fewer than eight characters.
//    A strong password contains letters and at least one number and is at least eight characters.
//    A very strong password contains letters, numbers, and special characters and is at least eight characters.
//    If a password does not meet any of these rules, then report it as a password of unknown strength.
//
//    Example Output
//    The password '12345' is a very weak password.
//    The password 'abcdef' is a weak password.
//    The password 'abc123xyz' is a strong password.
//    The password '1337h@xor!' is a very strong password.

//    Constraints
//    Create a passwordValidator function that takes in the password as its argument and returns a numeric value you can evaluate to determine the password strength.
//    Use a single output statement.

    public static void main(String[] args) {

        String password, passwordStrength;
        int passwordValue;

        // Take in input for password

        passwordValue = passwordValidator(password);

        // Check the int value and modify passwordStrength

        // Print out using printf

    }

    private int passwordValidator(String password) {

        int passwordValue;
        char ch;
        boolean containsNumbers = false, containsLetters = false, aboveEightCharacters, containsSpecial = false;

        // set aboveEightCharacters whether it was above or below eight

        // for 0 to password length
            // set ch to the char at index[i] of password
            // if it is a number using character.isDigit(ch)
                // set containsNumbers equal to true
            // if it is a letter using character.isLetter(ch)
                // set containsLetters equal to true
            // if it is a special character (not digit AND not letter)
                // set containsSpecial equal to true

        // if (containsNumbers and not containsLetters and not aboveEightCharacters)
            // return 0
        // else if (containsLetters and not containsNumbers and not aboveEightCharacters)
            // return 1
        // else if (containsLetters and containsNumbers and aboveEightCharacters)
            // return 2
        // else if (containsLetters, containsNumbers, containsSpecial, aboveEightCharacters)
            // return 3

        return -1;

    }

}
