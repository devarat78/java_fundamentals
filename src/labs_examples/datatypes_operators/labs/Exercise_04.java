package labs_examples.datatypes_operators.labs;

/**
 * Please demonstrate the use of all relational operators below. These include:
 *
 * less than, less than or equal to, greater than, greater than or equal to, and equal to
 *
 */
class RelationalOperators {

    public static void main(String[] args) {

        int a = 1;
        int b = 2;
        int c = 3;
        int d = 4;
        int e = 4;

        // example of "less than"

        if (a < b) {
            System.out.println("a is less than b");
        }
        // example of "less than or equal"

        if (e <= d){
            System.out.println("e is less than equal to d");
        }

        // example of "greater than"
        if (d > c) {
            System.out.println("d greater than c");
        }

        // example of "greater than or equal to"
        if (e >= d){
            System.out.println("e greater than equal to d");
        }
        // example of "equal to"
        if (d == e) {
            System.out.println("d is equal to e");
        }
        if (a != b){
            System.out.println("a is not equal to b");
        }
    }
}

