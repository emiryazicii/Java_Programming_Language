package lesson10_CustomMethods.practices;

public class Syllables {

    public static void main(String[] args) {

        System.out.println(displayHowManySyllables("ja-va"));
        System.out.println(displayHowManySyllables("cat"));
        System.out.println(displayHowManySyllables("ham-bur-ger"));
        System.out.println(displayHowManySyllables("de-liv-er-y"));

    }
    public static int displayHowManySyllables(String word){

        if (!word.contains("-")){
            return 1;
        }else {
            return (word.length() - word.replaceAll("-","").length())+1;
        }
    }
}
/*
T3Syllables [methods, String, loops]

    Create a method that has a String parameter and returns how many syllables the given word has
        > the String given will have a "-" to separate the different syllables

    Ex:
        ja-va -> 2
        cat -> 1
        ham-bur-ger -> 3
        de-liv-er-y -> 4
 */

