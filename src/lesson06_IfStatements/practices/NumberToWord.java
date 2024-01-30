package lesson06_IfStatements.practices;

public class NumberToWord {

    public static void main(String[] args) {

        int num = 5;

        String temp = "";

        if (num == 0) {
            temp = "Zero";
        }

        if (num == 1) {
            temp = "One";
        }

        if (num == 2) {
            temp = "Two";
        }

        if (num == 3) {
            temp = "Three";
        }

        if (num == 4) {
            temp = "Four";
        }

        if (num == 5) {
            temp = "Five";
        }

        if (num == 6) {
            temp = "Six";
        }

        if (num == 7) {
            temp = "Seven";
        }

        if (num == 8) {
            temp = "Eight";
        }

        if (num == 9) {
            temp = "Nine";
        }

        System.out.println(temp);

    }
}
/*
Create a class named NumberToWord, and write a java program that can convert numbers between 0 ~ 9 to words
			Ex:
				number = 1;

			output:
				One

		Note: Do not use more than one print statement

 */

