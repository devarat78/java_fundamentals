package labs_examples.conditions_loops.labs;

import java.util.Scanner;
/**
 * Conditions and Loops Exercise 5: Calculator
 *
 *      Take two numbers from the user, an upper and lower bound. Using a "for-loop", calculate the sum
 *      of numbers from the lower bound to the upper bound. Also, calculate the average of numbers.
 *      Print the results to the console.
 *
 *      For example, if a user enters 1 and 100, the output should be:
 *
 *      The sum is: 5050
 *      The average is: 50.5
 *
 *
 */

public class Exercise_05 {


    public static void main(String[] args) {

        System.out.println("Input the Lower Bound");
        Scanner sc = new Scanner(System.in);
        int lower = sc.nextInt();

        System.out.println("Input the Upper Bound");
        int upper = sc.nextInt();


        int x = 0;


        for(int i =lower; i <= upper; i++ ){
            x += i;

            // x = x + i;
            System.out.println(x);
        }

        double avg = (double)(lower+upper)/2;
        System.out.println("the average is: " +avg);



    }

}
