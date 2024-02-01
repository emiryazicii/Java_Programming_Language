package lesson11_ForLoop.practices;

public class Palindrome {

    public static void main(String[] args) {

        System.out.println(palindrome("racecar"));
        System.out.println(palindrome("anna"));
        System.out.println(palindrome("abc"));
        System.out.println(palindrome("abcba"));

    }
    public static boolean palindrome(String str){

        String reverse = "";

        str = str.trim().toLowerCase();

        for (int i = str.length() - 1; i >= 0; i--) {

            reverse += str.charAt(i);
        }

        return (str.equals(reverse));

    }
}
/*

[IQ] Palindrome [method, String, loop]

	create a method that will accept a String and return a boolean. Determine if the given String is a palindrome.
	A palindrome is when the characters being read from the beginning match the characters being read from the end. In other words, the reverse order of the word is the same as the original word order

		Ex:
			racecar
			true

			anna
			true

			abc
			false

			abcba
			true
 */

