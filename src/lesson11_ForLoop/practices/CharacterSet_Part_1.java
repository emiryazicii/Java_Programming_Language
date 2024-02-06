package lesson11_ForLoop.practices;

public class CharacterSet_Part_1 {

    public static void main(String[] args) {

        System.out.println(displayCharSequence('7','P'));
        System.out.println(displayCharSequence('X','}'));
    }
    public static String displayCharSequence(char startingChar , char endingChar){

        String temp = "";
        for (char i = startingChar; i <= endingChar ; i++) {

            temp +=""+i;
        }
        return temp ;
    }
}
/*
Create a method that will accept two chars and return a String.
	Based on the given chars, output a character sequence where the first char is the starting character and the second char is the ending character for the sequence

	Note: the character sequence will go in order, so the starting char should come before the ending char. Use the ascii table is a reference
    Ex:
        ('7', 'P') -> 789:;<=>?@ABCDEFGHIJKLMNOP
        ('X', '}') -> XYZ[\]^_`abcdefghijklmnopqrstuvwxyz{|}

 */

