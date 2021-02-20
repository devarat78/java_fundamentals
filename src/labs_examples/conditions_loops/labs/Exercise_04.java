package labs_examples.conditions_loops.labs;

/**
 * Conditions and Loops Exercise 4: Even numbers
 * <p>
 * Using a "for-loop", print out all even numbers from 1-100.
 */

public class Exercise_04 {

    public static void main(String[] args) {
        int sum = 0;

        for (int i = 1; i >= 1; i--) {

            if (i % 2 == 1) {
                sum = sum + i;
            }

        }
        System.out.println(sum);

    }
}













