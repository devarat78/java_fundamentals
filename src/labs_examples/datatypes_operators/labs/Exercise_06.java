package labs_examples.datatypes_operators.labs;
import java.util.Scanner;


/**
 * Fundamentals Exercise 4: Volume and Surface Area
 *
 *      Write the necessary code to calculate the volume and surface area of a cylinder
 *      with a radius of 3.14 and a height of 5. Print out the result.
 *
 */


public class Exercise_06 {



    public static void main(String[] args) {

        System.out.println("Enter radius: ");
        Scanner sc = new Scanner(System.in);
        double radius = sc.nextDouble();

        System.out.println("Enter height: ");
        double height = sc.nextDouble();


        //volume formula = pi*r^2*h

        double volume = Math.PI * Math.pow(radius,2) * height;
        System.out.println("the volume is : "+ volume);

        //surface area formula = 2 (pi)(r)(h) + 2 (pi)(r^2) =  2 pi r(h + r)

        double surfaceArea = (2 * Math.PI * radius * height) + (2 * Math.PI* Math.pow(3.14,2));
        System.out.println("the surface area is: "+ surfaceArea);

        for (int i= 0; i<=1000000; i++) {
            System.out.println(i);
        }

    }
}