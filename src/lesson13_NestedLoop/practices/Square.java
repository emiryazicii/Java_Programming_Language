package lesson13_NestedLoop.practices;

import java.util.Scanner;

public class Square {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        while (true) {

            System.out.println("Enter the side of the square.");
            double side = input.nextDouble();
            input.nextLine();

            double area = side * side,
                    perimeter = side * 4;

            if (side > 0) {
                System.out.println("Area : " + area + "\nPerimeter: " + perimeter);

                while (true) {

                    System.out.println("Would you like to continue");
                    String answer = input.nextLine().toLowerCase();

                    if (answer.equals("yes")) {
                        break;
                    } else if (answer.equals("no")) {
                        System.out.println("Thanks for using Cydeo Square Calculator App.");
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
Write a program that can calculate the area and perimeter of a Square:
                        1. Ask the user "Enter the side of the square:"
                                if user enters 0 or negative numbers, terminate the program after displaying the error message "Invalid Entry for the side of the square"

                        2. Display:
                                        1. Area of square
                                        2. Perimeter of square

                        3. Ask the user "Would you like to calculate another Square?"
                                        If "yes" --> repeat the previous steps
                                        If "No" --> Print "Thank you for using Cydeo Square Calculator APP"

                                If user enters an invalid entry, ask the user to re-enter until user provides a valid entry

                        Hint: you can use  System.exit(1) to terminate the entire program

 */

