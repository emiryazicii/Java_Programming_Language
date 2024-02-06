package lesson12_WhileLoop.practices;

public class CamelCase {

    public static void main(String[] args) {

        System.out.println(displayNewVersionOfTheString("JAVA will ruLE tHe wORLd"));
        System.out.println(displayNewVersionOfTheString("TeLL mE abOUt yOuRSelF"));
        System.out.println(displayNewVersionOfTheString("hOw dO yOU defiNE reAL"));
    }
    public static String displayNewVersionOfTheString(String str) {

        str = str.toLowerCase();

        while (str.contains(" ")) {

            String s = str.substring(str.indexOf(" ")+1,str.indexOf(" ")+2);

            str = str.replaceFirst(s,s.toUpperCase());
            str = str.replaceFirst(" ","");
        }
        return str;
    }
}
/*
T5CamelCase [loop, String, method]

 Create a method that will accept a String of words separated by spaces,
 and return a camel case version of the String where the first letter of each word is uppercase
 and the rest of the word is in lowercase.
    Exception: The first word starts with a lowercase
    Ex:
        Input:
            JAVA will ruLE tHe wORLd
        Output:
            javaWillRuleTheWorld
 */

