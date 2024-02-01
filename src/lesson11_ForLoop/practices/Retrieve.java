package lesson11_ForLoop.practices;

public class Retrieve {

    public static void main(String[] args) {

        System.out.println(retrive("B2C3D4F5H11Jagshc12546558985dsjaksacsa"));
    }
    public static String retrive(String str){


        String letters = "",
                digits = "",
                specialChars ="";

        for (char i = 'a'; i <= 'z' ; i++) {
            letters += (str.contains(""+i))? i : "";
        }
        for (char i = 'A'; i <= 'Z' ; i++) {
            letters += (str.contains(""+i))? i : "";
        }
        for (int i = 0; i <= 9 ; i++) {
            digits += (str.contains(""+i))? i : "";
        }
        for (char i = 33; i <=47 ; i++) {
            specialChars +=(str.contains(""+i))? i : "";
        }
        for (char i = 58; i <=64 ; i++) {
            specialChars += (str.contains(""+i))? i : "";
        }

        return "letters: "+letters +"\ndigits: "+digits +"\nspecial chars: "+specialChars;
    }
}
/*
5. write a program that can retrive the digits, letters and special characters from a string
            Ex:
                input:
                    mn@#123Ab!
                output:
                    letters: mnAb
                    digits: 123
                    special chars: @#!
 */

