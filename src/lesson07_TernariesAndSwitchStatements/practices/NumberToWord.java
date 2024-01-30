package lesson07_TernariesAndSwitchStatements.practices;

public class NumberToWord {

    public static void main(String[] args) {

        int number = 10;

        boolean valid = number >= 0 && number <= 9,
                one = number == 1, two = number == 2, three = number == 3,
                four = number == 4, five = number == 5, six = number == 6,
                seven = number == 7, eight = number == 8 ;

        String temp = (!valid) ? "Invalid Entry" : (one) ? "One" : (two) ? "Two" : (three) ? "Three"
                : (four) ? "Four" : (five) ? "Five" : (six) ? "Six" : (seven) ? "Seven"
                : (eight) ? "Eight" : "Nine";

        System.out.println(temp);

    }
}
/*
1. Create a class called NumberToWord,
		write a java program that can convert numbers between 0 ~ 9 to words
			Ex:
				number = 1;

			output:
				One

		Note: MUST use ternary

 */

