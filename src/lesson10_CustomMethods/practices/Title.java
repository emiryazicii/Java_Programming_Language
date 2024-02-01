package lesson10_CustomMethods.practices;

public class Title {

    public static void main(String[] args) {

        System.out.println(title("       aBUBAKAR   "));

    }
    public static String title(String str){

        str = str.trim();

        return str.substring(0,1).toUpperCase()+str.substring(1).toLowerCase();
    }
}
/*
6. Create a method named title that takes a string arguments

    The method returns the proper capitalized version of the given argument

    Ex:
        title("jAvA") ===> Java

 */

