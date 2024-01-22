package lesson12_whileLoop;

public class RemoveDuplicates {

    public static void main(String[] args) {

        String str = "xxzzzvvtttyyyyy";

        String temp = ""; // "abc"

        for (int i = 0; i < str.length() ; i++) { // i : index number of str

            char each = str.charAt(i); // each character of the str

            if (!temp.contains(""+each)){// if the string temp doesn't contain the character of string str yet
                temp += each; // then we will add the character to string result

            }
        }

        System.out.println(temp);
    }
}
/*
Write a program that can remove the duplicated characters from the a string

				Ex:
					str = "aabbbcccc"

					output:
						abc
 */