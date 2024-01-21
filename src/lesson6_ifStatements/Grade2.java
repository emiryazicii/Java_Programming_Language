package lesson6_ifStatements;

public class Grade2 {

    public static void main(String[] args) {

        char grade = 'F';

        String temp = "";

        if (grade == 'A') {
            temp = "Excellent";
        } else if (grade == 'B') {
            temp = "Great Job";

        } else if (grade == 'C') {
            temp = "Good";

        } else if (grade == 'D') {
            temp = "Passed";

        } else {
            temp = "Failed";
        }

        System.out.println(temp);
    }
}
/*
2. Create a class named Grade, a char variable named grade is given. write a program to print the following messages:
            'A': Excellent
            'B': Great job
            'C': Good
            'D': Passed
            'F': Failed

        Note: Do not use more than one print statement
 */