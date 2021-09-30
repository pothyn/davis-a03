package baseline;

public class Solution27 {

//    Write a program that prompts for a first name, last name, employee ID, and ZIP code.
//    Ensure that the input is valid according to these rules:
//
//    The first name must be filled in.
//    The last name must be filled in.
//    The first and last names must be at least two characters long.
//    An employee ID is in the format AA-1234. So, two letters, a hyphen, and four numbers.
//    The ZIP code must be a number.
//    Display appropriate error messages on incorrect data.
//
//            Example Output
//    Enter the first name: J
//    Enter the last name:
//    Enter the ZIP code: ABCDE
//    Enter the employee ID: A12-1234
//    The first name must be at least 2 characters long.
//    The last name must be at least 2 characters long.
//    The last name must be filled in.
//    The employee ID must be in the format of AA-1234.
//    The zipcode must be a 5 digit number.
//    Or
//
//    Enter the first name: John
//    Enter the last name: Johnson
//    Enter the ZIP code: 55555
//    Enter the employee ID: TK-4321
//    There were no errors found.
//            Constraints
//    Create a function for each validation rule. Then create a validateInput function that takes in all of the input data and invokes the specific validation functions.
//    Use a single output statement to display the outputs.

    public static void main(String[] args) {

        String firstName, lastName, zip, employeeID;

        // Prompt and read firstName
        // Prompt and read lastName
        // Prompt and read zip
        // Prompt and read employeeID

        // Create instance of Solution27 with given parameters

        validateInput(firstName, lastName, zip, employeeID);

    }

    private void validateInput(String firstName, String lastName, String zip, String employeeID) {

        String errorDisplay;

        // set errorDisplay to an empty string

        // if isNameFilledIn(firstName)
            // Add "The first name must be filled in.\n" to errorDisplay
        // if isNameFilledIn(lastName)
            // Add "The last name must be filled in.\n" to errorDisplay
        // if isNameTwoLetters(firstName)
            // Add "The first name must be at least 2 characters long.\n" to errorDisplay
        // if isNameTwoLetters(lastName)
            // Add "The last name must be at least 2 characters long.\n" to errorDisplay
        // if checkEmployeeID(employeeID)
            // Add "The employee ID must be in the format of AA-1234.\n" to errorDisplay
        // if checkZip(zip)
            // Add "The zipcode must be a 5 digit number.\n" to errorDisplay
        // if (everything mentioned above is false)
            // Add "There were no errors found.\n" to errorDisplay

        // print errorDisplay
    }

    private boolean isNameTwoLetters(String name) {
        // Check if 2 letters or less
            // return false
        // return true
    }

    private boolean isNameFilledIn(String name) {
        // Check if name is 0 characters
            // return false
        // return true
    }

    private boolean checkZip(String zip) {
        // Check if zip can be parsed all the way through (using try/catch)
            // return true
        // return false
    }

    private boolean checkEmployeeID(String employeeID) {
        // Check if string is 8 characters long
            // return false
        // Check if firstTwo characters of string are NOT letters (.isLetter())
            // return false
        // Check if third character is NOT a dash
            // return false
        // Check if chars 4-8 are NOT numbers (Character.isDigit())
            // return false
        // return true
    }


}
