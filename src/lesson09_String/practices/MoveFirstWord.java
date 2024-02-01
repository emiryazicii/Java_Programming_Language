package lesson09_String.practices;

import java.util.Scanner;

public class MoveFirstWord {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a sentence: ");
        String sentence = input.nextLine().trim();
        input.close();

        String firstWord = sentence.substring(0,sentence.indexOf(" ")),
                newSentence = sentence.substring(sentence.indexOf(" ")+1)+" "+firstWord;

        System.out.println(newSentence);
    }
}

/*
T4MoveFirstWord [String, Scanner]

    create a program that will ask the user to enter a sentence. Print the sentence with the first word moved to the end

    Input:
        Java is a fun language
    Output:
        is a fun language Java
 */

