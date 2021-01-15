package labs_examples.datatypes_operators.labs;

/**
 * Please demonstrate the use of all logical operators below. These include:
 *
 * AND, short-circuit AND, OR, short-circuit OR, XOR, NOT
 *
 */
class LogicalOperators {

    public static void main(String[] args) {

        // example of "OR"
        int i = 101;
        int z = 25;

        boolean a = true;
        boolean b = false;
        if (a | b){
            System.out.println("a or b is true");
        }
        //example short circuit OR
        if (a || b){
            System.out.println("a or b is true");
        }
        //example AND

        if (a & b){
            System.out.println("a and b is true");
        }
        // example of short and
        if (a && b){
            System.out.println("a and b is not true");
        }
        if (a ^ b){
            System.out.println("a is true from them both");
        }
        if (!b){
            System.out.println("a is not b");
        }
        // i z
        if (i > 100 && z < 100){
            System.out.println("i is greater than 100 and z is less than 100 ");
            //both are true
        }
    }
}

