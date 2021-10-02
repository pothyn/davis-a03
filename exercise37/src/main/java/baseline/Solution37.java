package baseline;

public class Solution37 {

//    Create a program that generates a secure password. Prompt the user for the minimum length,
//    the number of special characters, and the number of numbers. Then generate a password for the user using those inputs.
//
//            Example Output
//    What's the minimum length? 8
//    How many special characters? 2
//    How many numbers? 2
//    Your password is aurn2$1s#
//
//            Constraints
//    Use lists to store the characters you’ll use to generate the passwords.
//    Ensure that the generated password is random.
//    Ensure that there are at least as many letters are there are special characters and number.

    public static void main(String[] args) {
        // prompt and read minimum length
        // prompt and read number of special characters
        // prompt and read number of numbers

        // print generatePassword(minLength, specialChars, numbers)

    }

    public String generatePassword(int minLength, int specialChars, int numbers) {

        // for 0 to minLength (AND specialChar > 0 and numbers > 0)
            // if specialChar == 0 & numbers == 0 & string is less than minLength
                // addLetter()
            // else
                // randomly choose to add in a special char, number, or letter
                // call one of the three methods: addLetter(), addNumber(), or addSpecialChar()
                // decrease the amount of numbers or special characters depending on which func was called

        // return password
    }

    private char addLetter() {
        // return random letter
    }

    private char addNumber() {
        // return random number
    }

    private char addSpecialChar() {
        // return random special char
    }
}
