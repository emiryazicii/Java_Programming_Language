package lesson14_customClass;

public class UniqueCharacters1 {

    public static void main(String[] args) {


        String str = "aaabbbcdddfgggrrt",
                temp = "";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (str.indexOf(ch) == str.lastIndexOf(ch)){
                temp += ch;
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