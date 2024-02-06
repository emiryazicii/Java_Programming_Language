package lesson12_WhileLoop.practices;

public class TheCharHasTheHighestFrequency {

    public static void main(String[] args) {

        System.out.println(displayTheCharHasTheHighestFrequency("aaabbccccddeeee"));
    }
    public static String displayTheCharHasTheHighestFrequency(String str){

        // create a variable to use at the second loop
        String str1 = str ;
        // first loop to find max frequency
        int maxFr = 0;
        while (!str.isEmpty()) {
            char c = str.charAt(0);
            int cFr = str.length() - str.replace("" + c, "").length();

            if (cFr > maxFr) {
                maxFr = cFr;
            }
            str = str.replace("" + c, "");
        }
        // second loop to find and print the chars has the max frequency
        str = str1;
        String temp = "";

        while (!str.isEmpty()) {
            char c = str.charAt(0);
            int cFr = str.length() - str.replace("" + c, "").length();

            if (cFr == maxFr) {
                temp += c+"\n";
            }
            str = str.replace("" + c, "");
        }
        return temp;
    }
}


/*
Write a program that can return the character that has the highest frequency from a string
	Ex:
		str = "aaabbccccddeeee"

		output:
			c
			e
 */

