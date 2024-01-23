package lesson09_String;

import java.util.Scanner;

public class DigitLetterSpecialChar {

    public static void main(String[] args) {

        String word = new Scanner(System.in).nextLine();

        if (word.length() >=1 ) {

            char f = word.charAt(0);
            boolean upperCaseLetter = f >= 'A' && 'Z' >= f,
                    loverCaseLetter = f >= 'a' && 'z' >= f,
                    digit = f <= '9' && f >= '0';

            if (digit) {
                System.out.println("First character is digit.");
            } else if (upperCaseLetter) {
                System.out.println("First character is upper case letter.");
            } else if (loverCaseLetter) {
                System.out.println("First character is lover case letter.");
            } else {
                System.out.println("First character is special character.");
            }

        } else {
            System.out.println("String is empty.");
        }
    }
}
/*
 Create a class named DigitLetterSpecialChar and write a program that can ask the user to enter a word
	        - if the word starts with digits, print "first character is digit"
	        - if the word starts with uppercase letters, print "first character is lowercase letter"
	        - if the word starts with lowercase letters, print "first character is uppercase letter"
	        - if the word starts with special characters, print "first character is special character"


        	HINT: You need to check the ascii table


 */