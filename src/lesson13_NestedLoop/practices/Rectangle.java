package lesson13_NestedLoop.practices;

import java.util.Scanner;

public class Rectangle {


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        while (true) {

            System.out.println("Enter the length of the Rectangle:");
            double length = input.nextDouble();
            System.out.println("Enter the width of the Rectangle:");
            double width = input.nextDouble();
            input.nextLine();

            double area = length * width,
                    perimeter = 2 * (length + width);

            if (length > 0 && width > 0) {
                System.out.println("Area : " + area + "\nPerimeter: " + perimeter);

                while (true) {

                    System.out.println("Would you like to continue");
                    String answer = input.nextLine().toLowerCase();

                    if (answer.equals("yes")) {
                        break;
                    } else if (answer.equals("no")) {
                        System.out.println("Thanks for using Cydeo Rectangle Calculator App.");
                        input.close();
                        return;
                    } else {
                        System.err.println("Invalid entry, please reenter.");
                    }
                }
            } else {
                System.err.println("Invalid entry, please reenter.");
            }
        }
    }
}
/*
Write a program that can calculate the area and perimeter of a Rectangle:
                        1. Ask the user "Enter the length of the Rectangle:"
                                if user enters 0 or negative numbers, terminate the program after displaying the error message "Invalid Entry for the length of the rectangle"

                        2. Ask the user "Enter the width of the Rectangle:"
                                if user enters 0 or negative numbers, terminate the program after displaying the error message "Invalid Entry for the width of the rectangle"

                        3. Display:
                                        1. Area of rectangle
                                        2. Perimeter of rectangle

                        4. Ask the user "Would you like to calculate another Rectangle?"
                                        If "yes" --> repeat the previous steps
                                        If "No" --> Print "Thank you for using Cydeo Rectangle Calculator APP"

                                If user enters an invalid entry, ask the user to re-enter until user provides a valid entry

                        Hint: you can use  System.exit(1) to terminate the entire program

 */

