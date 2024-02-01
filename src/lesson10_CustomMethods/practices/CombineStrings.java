package lesson10_CustomMethods.practices;

public class CombineStrings {

    public static void main(String[] args) {

        System.out.println(combineStrings("     exactly  ","    your fault  "));

    }
    public static String combineStrings(String str1,String str2){

        str1 = str1.trim().toLowerCase();
        str2 = str2.trim().toLowerCase();

        return (str1.substring(str1.length()-1).equals(str2.substring(0,1)))? str1+str2.substring(1) : str1+str2;
    }

}
/*
5.  Create a method named combine that can take two string and hen add them together and returns it.
        But if the last letter of the first word and the first letter of the last letter are the same, return that character once.
    Ex:
        combine("one", "eight")  ==> oneight
 */

