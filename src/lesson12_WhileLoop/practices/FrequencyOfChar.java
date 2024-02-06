package lesson12_WhileLoop.practices;

import java.util.Scanner;

public class FrequencyOfChar {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = input.nextLine();

        String temp = "";

        while (!str.isEmpty()) {

            char c = str.charAt(0);
            int count = str.length() - str.replace(""+c, "").length();

            temp += ""+c + count;
            str = str.replace(""+c , "");
        }
        System.out.println(temp);
    }
}
/*
 7. Write a program that can find the frequency of the characters from a string

    Ex:
    str = "aabcccd";

    output:
    a2b1c3d1

    Hint: if you find out how to find the frequency of one character, then repeat it for all the remaining characters
 */

