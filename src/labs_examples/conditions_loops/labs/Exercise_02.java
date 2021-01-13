package labs_examples.conditions_loops.labs;
import java.util.*;
/**
 * Conditions and Loops Exercise 2: Days of the week
 *
 *      Take in a number from the user and print "Monday", "Tuesday", ... "Sunday", or "Other"
 *      if the number from the user is 1, 2,... 7, or other respectively. Use an if-else statement
 *      to accomplish this task.
 * 
 *      Bonus Tricky Challenge: Use a "nested-if" statement.
 *
 */

public class Exercise_02 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number between 1-7");
        int numDay = sc.nextInt();

        if(numDay ==1 ) {
            System.out.println("Sunday");
        }
        if(numDay ==2 ) {
            System.out.println("Monday");
        }
        if(numDay ==3 ) {
            System.out.println("Tuesday");
        }
        if(numDay ==4 ) {
            System.out.println("Wednesday");
        }
        if(numDay ==5 ) {
            System.out.println("Thursday");
        }


        // 1) create scanner (don't forget to import Scanner!)
        // 2) prompt user
        // 3) assign input to variable as int
        // 4) write completed code here

    }
}
