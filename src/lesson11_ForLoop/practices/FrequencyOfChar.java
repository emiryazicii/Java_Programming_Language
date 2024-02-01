package lesson11_ForLoop.practices;

import java.util.Scanner;

public class FrequencyOfChar {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a string.");
        String str = input.nextLine();
        System.out.println("Enter a char.");
        char c = input.next().charAt(0);

        System.out.println(frequencyOfChar(str,c));

        input.close();

    }
    public static int frequencyOfChar(String str, char c){

        int counC = 0;

        for (int i = 0; i < str.length() - 1; i++) {

            if (str.charAt(i) == c) {

                counC++;
            }
        }
        return counC;
    }
}
/*
3. Create a class named FrequencyOfChar and Write a program that asks user to enter a string and a char, the returns the frequency of the char from the given string
            Ex:
                inputs:
                    str = "aabcccd";
                    char = 'c';

                output: 3

                inputs:
                    "Java programming language"
                    'g'

                output: 4
 */

