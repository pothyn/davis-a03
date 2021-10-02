/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Hunter Davis
 */


//    Let's play Guess the Number!
//
//    Enter the difficulty level (1, 2, or 3): 1
//    I have my number. What's your guess? 5
//    Too low. Guess again: 7
//    Too low. Guess again: 9
//    You got it in 3 guesses!
//
//    Do you wish to play again (Y/N)? y
//
//    Enter the difficulty level (1, 2, or 3): 3
//    I have my number. What's your guess? 500
//    Too low. Guess again: 750
//    Too high. Guess again: 600
//    Too low. Guess again: 700
//    Too low. Guess again: 725
//    Too high. Guess again: 715
//    Too high. Guess again: 710
//    Too high. Guess again: 705
//    Too high. Guess again: 701
//    Too low. Guess again: 702
//    You got it in 10 guesses!
//
//    Do you wish to play again (Y/N)? n


package baseline;

public class Solution32 {

    private int counter;
    private int secretNumber;

    public Solution32() {
        // set counter equal to 0
        // secretNumber will be given a value later
    }

    public static void main(String[] args) {

        boolean innerWhile;
        boolean outerWhile;
        int playAgain = -1;

        // introduce game

        // while loop (outerWhile)
            // take input for difficulty level
            // generateRandom();
            // innerWhile = false

            // while loop (innerWhile)
                // take input
                // if(digitChecker(input))
                    // innerWhile = checkSecretNumber(input, secretNumber);
                // else
                    // invalid input, try again

            // print counter
            // counter = 0

            // play again?
            // while (playAgain is not -1)
                // take in input
                // playAgain = ynChecker()
            // if playAgain = 1
                // break
            // playAgain = -1

    }

    public boolean digitChecker(String input) {
        // for 0 to string length
            // if this char is not a digit
                // return false
    }

    public int ynChecker(String input) {

        // if input is "y"
            // return 0;
        // else if input is "n"
            // return 1;
        // else
            // return -1;

    }

    public boolean checkSecretNumber(String guess, int secretNumber) {
        // guessInt is guess parsed

        // just right
        // if guess == secretNumber
            // return true
        // too high
        // else if guess > secretNumber
            // print too high. guess again
            // return false
        // too low
        // else
            // print too low. guess again
            // return false
    }

    public void generateRandom(int max) {
        // secretNumber = random value between 1 and max
    }

}
