package lesson06_IfStatements.practices;

public class Grade {

    public static void main(String[] args) {

        char grade = 'F';

        boolean validGrade = grade == 'A' || grade == 'B' || grade == 'C' || grade == 'D' || grade == 'F',
                gradeA = (grade == 'A'), gradeB =  grade == 'B', gradeC =   grade == 'C',
                gradeD = grade == 'D';

        String temp = "";

        if (!validGrade) {
            temp = "Invalid Entry";
        } else if (gradeA) {
            temp = "Excellent";
        } else if (gradeB) {
            temp = "Great Job";
        } else if (gradeC) {
            temp = "Good";
        } else if (gradeD) {
            temp = "Passed";
        } else {
            temp = "Failed";
        }

        System.out.println(temp);
    }
}
/*
2. Create a class called Grade, a char variable named grade is given. write a program to print the following messages:
            'A': excellent
            'B': great job
            'C': good
            'D': passed
            'F': failed
            other wise: invalid

            NOTE: MUST USE NESTED IF. DO NOT USE MORE THAN ONE PRINT STATEMENT
 */

