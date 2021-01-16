package labs_examples.conditions_loops.labs;

import java.util.*;

/**
 * Conditions and Loops Exercise 2: Days of the week
 * <p>
 * Take in a number from the user and print "Monday", "Tuesday", ... "Sunday", or "Other"
 * if the number from the user is 1, 2,... 7, or other respectively. Use an if-else statement
 * to accomplish this task.
 * <p>
 * Bonus Tricky Challenge: Use a "nested-if" statement.
 */

public class Exercise_02 {

    public static void main(String[] args) {
        // 1) create scanner (don't forget to import Scanner!)
        Scanner sc = new Scanner(System.in);
        // 2) prompt user
        System.out.println("Enter any number between 1-7");
        // 3) assign input to variable as int
        int numDay = sc.nextInt();
        // 4) write completed code here

        if (numDay == 1) {
            System.out.println("Sunday");
        } else if (numDay == 2) {
            System.out.println("Monday");
        } else if (numDay == 3) {
            System.out.println("Tuesday");
        } else if (numDay == 4) {
            System.out.println("Wednesday");
        } else if (numDay == 5) {
            System.out.println("Thursday");
        } else if (numDay == 6) {
            System.out.println("Friday");
        } else if (numDay == 7) {
            System.out.println("Saturday");
        }
    }
}