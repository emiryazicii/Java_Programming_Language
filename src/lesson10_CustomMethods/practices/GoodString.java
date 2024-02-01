package lesson10_CustomMethods.practices;

public class GoodString {

    public static void main(String[] args) {

        goodString("agoodplayer");
    }

    public static void goodString(String str) {

        Boolean valid = str.startsWith("good", 1) || str.startsWith("good", 2);

        System.out.println(valid);
    }
}
/*
T1GoodString [String, indexes]

	Create a program that will check a given String. If the word "good" starts at index 1 or 2 print true otherwise print false

	ex:
		goodday --> false
		agoodmovie --> true
		nogoodtoday -> true
		notgoodfornow -> false
 */

