package lesson06_IfStatements.practices;

public class MinimumNumber {

    public static void main(String[] args) {

        double num1 = -124, num2 = 568;

        boolean num1Min = num2 > num1,
                num2Min = num1 > num2;

        String temp = "";

        if (num1Min) {

            temp = num1 + " is the minimum number.";
        } else if (num2Min) {

            temp = num2 + " is the minimum number. ";
        } else {

            temp = "Numbers are equal.";
        }
        System.out.println(temp);

    }
}
/*
1. Create a class named MinimumNumber.java
2. Declare the following variables:

1. num1
2. num2

3. Write a program that can print the minimum number between the
two numbers above, if both are equal then print Equal

Ex:

num1 = 10
num2 = 20

output:
10 is the minimum number
 */

