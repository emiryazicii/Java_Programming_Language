package lesson7_ifStatements;

public class Grade {

    public static void main(String[] args) {

        char grade = 'B';

        String temp = "";

        if (grade == 'A') {
            temp = "Excellent";
        }

        if (grade == 'B') {
            temp = "Great Job";
        }

        if (grade == 'C') {
            temp = "Good";
        }

        if (grade == 'D') {
            temp = "Passed";
        }

        if (grade == 'F') {
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