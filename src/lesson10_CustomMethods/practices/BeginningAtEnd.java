package lesson10_CustomMethods.practices;

public class BeginningAtEnd {

    public static void main(String[] args) {

        beginningAtEnd("eraser for the computer");

    }
    public static void beginningAtEnd(String str){

        str = str.trim().toLowerCase();

        boolean same = str.substring(0,2).equals(str.substring(str.length()-2));

        System.out.println(same);
    }
}
/*
T2BeginningAtEnd [String, indexes]

	Create a program that will check if the first two characters of a given String are also the last two characters of the String. Print true if they are the same and false if they are not the same

	ex:
		educated -> true
		java -> false
		eraser for the computer -> true
		panda giftwrap -> false

 */

