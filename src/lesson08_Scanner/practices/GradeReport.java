package lesson08_Scanner.practices;

import java.util.Scanner;

public class GradeReport {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your score: ");

        int score = input.nextInt();
        boolean gradeA = score >= 90, gradeB = score >= 80, gradeC = score >= 70, gradeD = score >= 60,
                valid = score <= 100 && score >= 0;

        String result = (!valid) ? "Invalid Score, Enter a number between 0 to 100" :
                        (gradeA) ? "Your grade is: A" : (gradeB) ? "Your grade is: B" :
                        (gradeC) ? "Your grade is: C" : (gradeD) ? "Your grade is: D" : "Your grade is: F";

        System.out.println(result);
        input.close();
    }
}
/*
 Create a class named GradeReport:
            2.1 Ask the user to enter the his/her score
            2.2 Print the grade of the student (A, B, C, D, F)
            2.3 If user enter invalid score (negative or more than 100) print invalid score

 */

