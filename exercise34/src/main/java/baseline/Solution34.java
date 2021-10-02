/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Hunter Davis
 */

//        Create a small program that contains a list of employee names.
//        Print out the list of names when the program runs the first time.
//        Prompt for an employee name and remove that specific name from the list of names.
//        Display the remaining employees, each on its own line.
//
//        Example Output
//        There are 5 employees:
//        John Smith
//        Jackie Jackson
//        Chris Jones
//        Amanda Cullen
//        Jeremy Goodwin
//
//        Enter an employee name to remove: Chris Jones
//
//        There are 4 employees:
//        John Smith
//        Jackie Jackson
//        Amanda Cullen
//        Jeremy Goodwin

//        Constraint
//        Use an array or list to store the names.

package baseline;

import java.util.ArrayList;
import java.util.Scanner;

public class Solution34 {

    private ArrayList<String> employeeList = new ArrayList<>();
    private static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) {

        Solution34 app = new Solution34();
        String userInput;

        // call addEmployee for the 5 employee names
        app.addEmployee("John Smith");
        app.addEmployee("Jackie Jackson");
        app.addEmployee("Chris Jones");
        app.addEmployee("Amanda Cullen");
        app.addEmployee("Jeremy Goodwin");

        // print listEmployees()
        System.out.println(app.listEmployees());

        // Ask to remove one
        System.out.print("Enter an employee name to remove: ");
        userInput = in.nextLine();

        // Remove employee
        app.removeEmployee(userInput);

        // List employees
        System.out.println(app.listEmployees());
    }

    public void addEmployee(String name) {
        // add string to ArrayList
        employeeList.add(name);
    }

    public void removeEmployee(String name) {
        // remove string from ArrayList
        employeeList.remove(name);
    }

    public String listEmployees() {
        String list = "\nThere are " + employeeList.size() + " employees:\n";

        for(int i = 0; i < employeeList.size(); i++)
            // add the string at index i of array list and a new line
            list += employeeList.get(i) + "\n";

        return list;
    }

}
