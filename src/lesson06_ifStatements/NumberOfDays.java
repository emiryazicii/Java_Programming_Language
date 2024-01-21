package lesson06_ifStatements;

public class NumberOfDays {

    public static void main(String[] args) {

        int month = 5;

        boolean has28Days = month ==2;
        boolean has30Days = month ==4 || month ==6 || month ==9 || month ==11;
        boolean has31Days = !has28Days && !has30Days;

        String temp = "";

        if (has28Days){ temp = "28 Days";}

        if (has30Days){ temp = "30 Days";}

        if (has31Days){ temp = "31 Days";}

        System.out.println(temp);

    }
}
/*
1. Create a class named NumberOfDays.java
2. An integer variable named month is declared and given, Write a
program that can print the number of days in the given month

Ex:
Given:
number = 1

output:
31 days

Hints:
Months that has 31 days are: 1, 3, 5, 7, 8, 10, 12
Months that has 30 days are: 4, 6, 9, 11
Month that has 28 days: 2
 */