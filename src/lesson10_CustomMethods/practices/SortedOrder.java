package lesson10_CustomMethods.practices;

public class SortedOrder {

    public static void main(String[] args) {


        System.out.println(isSorted("abcd"));
        System.out.println(isSorted("abzy"));
        System.out.println(isSorted("efghuvyz"));
        System.out.println(isSorted("enimenimini"));

    }
    public static boolean isSorted(String str){

        boolean sorted = false; // Assigning any value to use boolean variable(sorted) later out of the loop.

        for (int i = 0; i < str.length()-1; i++) {

            sorted = (str.charAt(i)+1 == str.charAt(i+1));
        }
        return sorted;
    }
}
/*
T4SortedOrder [loop, String, method]

    Create a method that accepts a String and returns a boolean.
        return true if the given String is sorted meaning the characters are in alphabetical order
        return false if the given String is not sorted

    Ex:
        input: "abcd"
        output: true

        input: "abzy"
        output: false
 */

