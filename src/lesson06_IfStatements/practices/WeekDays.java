package lesson06_IfStatements.practices;

public class WeekDays {

    public static void main(String[] args) {

        int number = 3;

        String temp = "";

        if (number == 1) {
            temp = "Monday";
        }
        if (number == 2) {
            temp = "Tuesday";
        }
        if (number == 3) {
            temp = "Wednesday";
        }
        if (number == 4) {
            temp = "Thursday";
        }
        if (number == 5) {
            temp = "Friday";
        }
        if (number == 6) {
            temp = "Saturday";
        }
        if (number == 7) {
            temp = "Sunday";
        }

        System.out.println(temp);
    }
}
/*
1. Create a class named WeekDays.java
2. An integer variable named number is declared and given, Write a
program that can print the name of the day that the number represents

Ex:
Given:
number = 1

output:
Monday

Hint: Assume that a number between 1 ~ 7 is given to the variable
 */

