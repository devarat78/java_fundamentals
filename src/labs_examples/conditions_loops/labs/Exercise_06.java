package labs_examples.conditions_loops.labs;
import java.util.*;

/**
 * Conditions and Loops Exercise 6: Basic while loop
 *
 *      Use a "while" loop find the sum of numbers to from 1-100. Print the sum to the console
 *
 */

public class Exercise_06 {
    public static void main(String[] args) {

        System.out.println("Input the Lower Bound");
        Scanner sc = new Scanner(System.in);
        int lower = sc.nextInt();

        System.out.println("Input the Upper Bound");
        int upper = sc.nextInt();


        int sum = 0;

        int i =lower;
        while( i<=upper){
            sum += i;

            // sum = sum + i;
            System.out.println(sum);
            i++;
        }
    }
}
