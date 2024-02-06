package lesson13_NestedLoop.practices;

import java.util.Scanner;

public class GradeCalculator {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("Enter your score:");

            if (input.hasNextInt()) {
                int score = input.nextInt();
                input.nextLine();

                if (score >= 0 && score <= 100) {
                    String grade = (score >= 90) ? "A" : (score >= 80) ? "B" : (score >= 70) ? "C" : (score >= 60) ? "D" : "F";
                    System.out.println("Your grade is: " + grade);

                    while (true) {
                        System.out.println("Would you like to continue?");
                        String answer = input.nextLine().toLowerCase();

                        if (answer.equals("yes")) {
                            break;
                        } else if (answer.equals("no")) {
                            System.out.println("Thanks for using Cydeo Grade Calculator App.");
                            return;
                        } else {
                            System.err.println("Invalid entry, please reenter.");
                        }
                    }
                } else {
                    System.err.println("Invalid entry, please reenter.");
                }
            } else {
                System.err.println("Invalid input. Please enter a valid integer.");
                input.nextLine();
            }
        }
    }
}



/*
Write a program for grade calculator:
                        1. Ask the user "Enter your score"
                                If user enters invalid score, terminate the program after displaying the error message "Invalid Entry"

                         2. Display the grade of the student.
                                        90 ~ 100 ==> A
                                        80 ~ 89 ==> B
                                        70 ~ 79 ==> C
                                        60 ~ 69 ==> D
                                        0 ~ 59 ==> F

                        2. Ask the user would you like to continue
                                If "yes" --> repeat the previous steps
                                If "no" --> print "Thank you for using Cydeo Grade Calculator APP"

                                If user enters an invalid entry, terminate the program after displaying the error message "Invalid Entry"


                         Hint: you can use  System.exit(1) to terminate the entire program
 */

