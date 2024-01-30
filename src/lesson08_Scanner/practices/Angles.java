package lesson08_Scanner.practices;

import java.util.Scanner;

public class Angles {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter three angles:");

        double angle1 = input.nextDouble();
        double angle2 = input.nextDouble();
        double angle3 = input.nextDouble();

        input.close();

        boolean triangle = angle1 + angle2 + angle3 == 180 ,
                circle  = angle1 + angle2 + angle3 == 360;

        String temp = (triangle)? "The shape is Triangle." :(circle)? "The shape is Circle."
                : "Cannot Determine.";

        System.out.println(temp);
    }
}
/*
T2Angles [Scanner, ternary]

	create a program that will ask the user to enter 3 angles. Add to sum of the angles and print what type of shape is made from the angles.
		If the angles add up to 180 print triangle.
		If the angles add up to 360 print circle
		For any other angle print: Cannot determine
 */

