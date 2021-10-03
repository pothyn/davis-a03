package baseline;

import java.util.*;

public class Solution39 {

    private List<Map<String,String>> people;
    private static final String FIRST = "First Name";
    private static final String LAST = "Last Name";
    private static final String POS = "Position";
    private static final String SEP_DATE = "Separation Date";


    public static void main(String[] args) {

        Solution39 app = new Solution39();

        app.people = new ArrayList<>();

        // Add the given persons to the people List map
        app.addPreset();

        // Sort the list
        app.sort();

        // Display the given map
        app.displayMap();
    }

    public String getValue(int a, int b) {
        // Accessor method mostly used for finding specific values and testing
        String secondVal;
        if(b==0)
            secondVal = FIRST;
        else if(b==1)
            secondVal = LAST;
        else if(b==2)
            secondVal = POS;
        else
            secondVal = SEP_DATE;

        return people.get(a).get(secondVal);
    }

    public void addPerson(Map<String, String> person) {
        people.add(person);
    }

    private void displayMap() {
        System.out.print("\n\t\t\tName\t  |\t\t\tPosition\t|\tSeparation Date\n");
        System.out.println("----------------------|---------------------|-------------------");
        for (Map<String, String> person : people) {
            System.out.printf("%10s", person.get(FIRST));
            System.out.printf("%14s", person.get(LAST) + " | ");
            System.out.printf("%22s", person.get(POS) + " | ");
            System.out.printf("%15s", person.get(SEP_DATE) + "\n");
        }
    }

    public void sort() {
        Comparator<Map<String, String>> peopleCompare =
                Comparator.comparing((Map<String, String> person) -> person.get(LAST));

        people.sort(peopleCompare);
    }

    public void addPreset() {
//        John	Johnson	        Manager	    2016-12-31
        addPerson(Map.of(
                FIRST, "John",
                LAST, "Johnson",
                POS, "Manager",
                SEP_DATE, "2016-12-31"
        ));
//        Tou	Xiong	Software Engineer	2016-10-05
        addPerson(Map.of(
                FIRST, "Tou",
                LAST, "Xiong",
                POS, "Software Engineer",
                SEP_DATE, "2016-10-05"
        ));
//        Michaela	Michaelson	District Manager	2015-12-19
        addPerson(Map.of(
                FIRST, "Michaela",
                LAST, "Michaelson",
                POS, "District Manager",
                SEP_DATE, "2015-12-19"
        ));
//        Jake	Jacobson	Programmer
        addPerson(Map.of(
                FIRST, "Jake",
                LAST, "Jacobson",
                POS, "Programmer",
                SEP_DATE, ""
        ));
//        Jacquelyn	Jackson	DBA
        addPerson(Map.of(
                FIRST, "Jacquelyn",
                LAST, "Jackson",
                POS, "DBA",
                SEP_DATE, ""
        ));
//        Sally	Webber	Web Developer	2015-12-18
        addPerson(Map.of(
                FIRST, "Sally",
                LAST, "Webber",
                POS, "Web Developer",
                SEP_DATE, "2015-12-18"
        ));
    }
}
