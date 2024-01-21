package lesson09_string;

import java.util.Scanner;

public class LongestString {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter string 1:");
        String string1 = input.nextLine();

        System.out.println("Please enter string 2:");
        String string2 = input.nextLine();

        input.close();

        if (string1.length() > string2.length()) {
            System.out.println("First string is the longest.");
        } else if (string2.length() > string1.length()) {
            System.out.println("Second string is the longest.");
        } else {
            System.out.println("Equal");
        }
    }
}
/*
1. Create a class named LongestString
			1.1 Ask the user to enter two strings
			1.2 Write a program that can print the longest string, if both have the same number of characters then print "Equal"

 */