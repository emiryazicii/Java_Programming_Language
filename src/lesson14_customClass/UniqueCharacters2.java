package lesson14_customClass;

public class UniqueCharacters2 {

    public static void main(String[] args) {

        String str = "aabcccd",
                temp = "";

        for (int j = 0; j < str.length(); j++) {

            char ch = str.charAt(j); // a2b1c3d1
            int frequency = 0;

            for (int i = 0; i < str.length(); i++) { // checks how many times the ch has appeared in str
                if (str.charAt(i) == ch) {// if the ch has appeared in the string
                    frequency++; // increase the frequency by 1
                }
            }
            if (frequency == 1) { // if the frequency is one, then it's unique
                temp += "" + ch;
            }
        }
        System.out.println(temp);
    }
}
/*
1. Write a program that can find the unique characters from a String
			Ex:
				str = "aabcccd"

				output:
					bd
 */