package lesson06_IfStatements.practices;

public class GradeLevel {

    public static void main(String[] args) {

        int gradeLevel =18;

        boolean valid = gradeLevel <= 18 && gradeLevel >= 1,
                oneTo5 = gradeLevel <= 5,
                sixTo8 = gradeLevel <= 8,
                nineTo12 = gradeLevel <= 12,
                thirteenTo16 = gradeLevel <= 16;


        String temp = "";

        if (!valid) {
            temp = "Invalid grade level.";
        }
        else if (oneTo5) {
            temp = "Elementary School";
        }
        else if (sixTo8) {
            temp = "Middle School";
        }
        else if (nineTo12) {
            temp = "High School";
        }
        else if (thirteenTo16) {
            temp = "College";
        }
        else{
            temp = "Grad School";
        }
        System.out.println(temp);
    }
}
/*
1. Create a class named GradeLevel.java
2. An integer variable named gradeLevel is declared and given, Write
a program to determine and print which school type someone is in

Ex:

gradeLevel = 2
output:
Elementary School
The grade level and types are:
1 ~ 5: Elementary school
6 ~ 8: Middle school
9 ~ 12: High school
13 ~ 16: College
17 ~ 18: Grad School

Assume that the given number is 1 ~ 18
 */

