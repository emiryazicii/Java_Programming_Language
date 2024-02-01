package lesson09_String.practices;

import java.util.Scanner;

public class ModifyWord {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a word: ");
        String word = input.next();
        input.close();

        int lgh = word.length();
        String firstLetter = word.substring(0,1), lastLetter = word.substring(lgh-1);

        boolean ifSameLetter = firstLetter.equals(lastLetter);

        String word1 = word.substring(1,lgh-1),
                word2 = firstLetter.replace(firstLetter.charAt(0),'*')+word1+lastLetter.replace(lastLetter.charAt(0),'#'),
                temp = (ifSameLetter)? word1 : word2 ;

        System.out.println(temp);
    }
}
/*
ModifyWord [indexes, conditional]

	Create a program that will ask the user to enter a word. Check if the word starts and ends with the same character. If they are the same delete those characters

	if the characters we not the same replace the first charter to be '*' and the last character to be #

	print the results

 */

