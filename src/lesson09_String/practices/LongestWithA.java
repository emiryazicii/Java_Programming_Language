package lesson09_String.practices;

import java.util.Scanner;

public class LongestWithA {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter three words: ");
        String w1 = input.next().toLowerCase(),
                w2 = input.next().toLowerCase(),
                w3 = input.next().toLowerCase();

        System.out.println("Enter a letter to check if the words contain it: ");
        String letter = input.next().toLowerCase();
        input.close();

        String temp = "";

        if (w1.contains(letter) && (w1.length() > w2.length() && w1.length() > w3.length())) {
            temp = w1;
        } else if (w2.contains(letter) && (w2.length() > w1.length() && w2.length() > w3.length())) {
            temp = w2;
        } else if (w3.contains(letter) && (w3.length() > w1.length() && w3.length() > w2.length())) {
            temp = w3;
        } else {
            System.out.println("None of the words contain \"" + letter + "\" ");
        }
        System.out.println(temp);
    }
}
/*
T5LongestWithA [Scanner, String, conditional, logical]

	Create a program that will ask the user to enter 3 words. Find the word that contains 'a' and is the longest out of the others

	ex:
		java
		mouse
		computer

	Output: java

	Extra: Instead of just checking for "a" ask the enter to enter the character that should be used to determine the result
 */

