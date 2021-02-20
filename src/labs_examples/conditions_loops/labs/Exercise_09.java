package labs_examples.conditions_loops.labs;

/**
 * Conditions and Loops Exercise 9: break
 *
 *      Demonstrate the use of the "break" statement to exit a loop.
 *
 */

public class Exercise_09 {

    public static void main(String[] args) {
        int a = 250;
        for(int i = 1; i < 10; i++){
        if(a%2 == 1){
            System.out.println(i);
            System.out.println(a);
            break;
        }
        a /= i;
        }
    }
}
