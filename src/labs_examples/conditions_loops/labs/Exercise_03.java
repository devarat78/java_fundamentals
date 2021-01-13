package labs_examples.conditions_loops.labs;
import java.util.*;
/**
 * Conditions and Loops Exercise 3: Months of the year
 *
 *      Take in a number from the user and print "January", "February", ... "December", or "Other"
 *      if the number from the user is 1, 2,... 12, or other respectively. Use a "switch" statement.
 *
 */

public class Exercise_03 {
    public static void main(String args[]){
        Scanner bob = new Scanner(System.in);
        System.out.println("Print any number between 1 - 12");
        int month = bob.nextInt();

        String monthString;

        // switch statement with int data type
        switch (month) {
            case 1:
                monthString = "Jan";
                break;
            case 2:
                monthString = "Feb";
                break;
            case 3:
                monthString = "Mar";
                break;
            case 4:
                monthString = "Apr";
                break;
            case 5:
                monthString = "May";
                break;
            case 6:
                monthString = "Jun";
               break;
            case 7:
                monthString = "Jul";
              break;
            case 8:
                monthString = "Aug";
                break;
            case 9:
                monthString = "Sep";
                break;
            case 10:
                monthString = "Oct";
                break;
            case 11:
                monthString = "Nov";
                break;
            case 12:
                monthString = "December";

            default:
                monthString = "Invalid day";
        }
        System.out.println(monthString);


    }

}
