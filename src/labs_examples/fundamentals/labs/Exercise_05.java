package labs_examples.fundamentals.labs;


/**
 * Fundamentals Exercise 5: Working with Strings
 *
 *      Please follow the instructions in the comments below
 *
 */

public class Exercise_05 {

    public static void main(String[] args) {

        String str = "hello!";
        // please declare an int variable below, and set it to the value of the length of "str"
        int a = str.length();
        System.out.println(a);
        String str2 = "hello";
        // please initialize a boolean variable and test whether str is equal to str2
        boolean bool = str.equals(str2);
        System.out.println(" does str equal str 2 " + bool);
        // please concatenate str & str2 and set the result to a new String variable below

        // please demonstrate the use of any other method that is available to us in the String class
        // for example, replace(), substring(), contains(), indexOf() etc
        System.out.println(str2.contains("llo"));
    }


}