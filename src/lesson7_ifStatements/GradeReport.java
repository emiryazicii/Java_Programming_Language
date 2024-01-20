package lesson7_ifStatements;

public class GradeReport {

    public static void main(String[] args) {

        int score = 51;

        String temp = "Your grade is ";

        if (score >= 90) {
            temp += "A";
        } else if (score >= 80) {
            temp += "B";

        } else if (score >= 70) {
            temp += "C";

        } else if (score >= 60) {
            temp += "D";

        } else {
            temp += "F";
        }
        System.out.println(temp);
    }
}
/*
1. Create a class named GradeReport.java
2. An integer variable named score is declared and given, Write a
program that can print the grade of the student

Ex:

score = 95

output:
Your grade is A


   A = 100 ~ 90
   B = 89 ~ 80
   C = 79 ~ 70
   D = 69 ~ 60
   F = 59 ~0

Note: Assume that the given score is between 0 ~ 100
 */