package lesson06_IfStatements;

public class MonthName {

    public static void main(String[] args) {

        int num = 5;

        String month = "";

        if (num <= 12 && num >= 1) {

            if (num == 1) {
                month = "January";
            } else if (num == 2) {
                month = "February";
            } else if (num == 3) {
                month = "March";

            } else if (num == 4) {
                month = "April";

            } else if (num == 5) {
                month = "May";

            } else if (num == 6) {
                month = "June";

            } else if (num == 7) {
                month = "July";

            } else if (num == 8) {
                month = "August";

            } else if (num == 9) {
                month = "September";

            } else if (num == 10) {
                month = "October";

            } else if (num == 11) {
                month = "November";

            } else {
                month = "December";
            }

        } else {
            month = "No such a month";
        }
        System.out.println(month);
    }
}
/*
1. Create a class named MonthName.java
2. An integer variable named number is declared and given, Write a
program that can print the name of the month that the number
represents. (only if the given number is a valid number, then print the
name of the month. Otherwise print Invalid)

Ex:
Given:
number = 10

output:

October
 */