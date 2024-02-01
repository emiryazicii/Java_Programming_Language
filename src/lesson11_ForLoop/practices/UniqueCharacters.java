package lesson11_ForLoop.practices;

public class UniqueCharacters {

    public static void main(String[] args) {

        System.out.println(displayUniqueCharacters("AABCCDEEEFGGHTTTUVVYZZZ"));

    }
    public static String displayUniqueCharacters(String str){

        String unique = "";

        for (int i = 0; i <= str.length()-1; i++) {

            char c = str.charAt(i);

            if (str.indexOf(c) == str.lastIndexOf(c)){

                unique += c;
            }
        }
        return unique;
    }
}
/*
9. Create a class called UniqueCharacters, Write a program that can return the unique characters from a String

	            Ex:
	                input:
	                    AABCCD

	                output:
	                    BD
 */

