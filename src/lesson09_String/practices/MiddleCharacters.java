package lesson09_String.practices;

import java.util.Scanner;

public class MiddleCharacters {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a word: ");
        String word = input.next().toLowerCase();
        input.close();

        int lgh = word.length();
        boolean oddLength = lgh % 2 != 0 ;

        String midCharIfLghIsOdd = word.substring(lgh/2,lgh/2+1).toUpperCase(),
                midCharsIfLghIsEven =word.substring(lgh/2-1,lgh/2+1).toUpperCase(),

                word1 = word.substring(0,lgh/2)+midCharIfLghIsOdd+word.substring(lgh/2+1),
                word2 = word.substring(0,lgh/2-1)+midCharsIfLghIsEven+word.substring(lgh/2+1),

                temp = (oddLength)? word1 : word2 ;

        System.out.println(temp);
    }
}

/*
MiddleCharacters [indexes, cases, length]

	Create a program that will ask the user to enter a word. Return the word in lowercase expect for the middle character/s in uppercase

	Note: based on if the word is even or odd there will be either two middle characters(even length) or one middle character (odd length)

	Ex:
		input:
			apple
		output:
			apPle

		input:
			JavA
		output:
			jAVa
 */

