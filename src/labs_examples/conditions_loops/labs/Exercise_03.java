package labs_examples.conditions_loops.labs;

import java.util.*;

/**
 * Conditions and Loops Exercise 3: Months of the year
 * <p>
 * Take in a number from the user and print "January", "February", ... "December", or "Other"
 * if the number from the user is 1, 2,... 12, or other respectively. Use a "switch" statement.
 */

public class Exercise_03 {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Print any number between 1 - 12");
        int month = sc.nextInt();
        String monthString;

        // switch statement with int data type
        switch (month) {
            case 1:
                monthString = "Jan";
                System.out.println(monthString);
                break;
            case 2:
                monthString = "Feb";
                System.out.println(monthString);
                break;
            case 3:
                monthString = "Mar";
                System.out.println(monthString);
                break;
            case 4:
                monthString = "Apr";
                System.out.println(monthString);
                break;
            case 5:
                monthString = "May";
                System.out.println(monthString);
                break;
            case 6:
                monthString = "Jun";
                System.out.println(monthString);
                break;
            case 7:
                monthString = "Jul";
                System.out.println(monthString);
                break;
            case 8:
                monthString = "Aug";
                System.out.println(monthString);
                break;
            case 9:
                monthString = "Sep";
                System.out.println(monthString);
                break;
            case 10:
                monthString = "Oct";
                System.out.println(monthString);
                break;
            case 11:
                monthString = "Nov";
                System.out.println(monthString);
                break;
            case 12:
                monthString = "Dec";
                System.out.println(monthString);
                break;

            default:
                monthString = "Invalid day";
                System.out.println(monthString);
        }
    }
}