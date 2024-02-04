package lesson11_ForLoop.practices;

public class CountHi {

    public static void main(String[] args) {

        System.out.println(countHi("hilibilihiliholi"));
        System.out.println(countHi("aahiahiaaahh"));
        System.out.println(countHi("maiahimaiahemaiahamaiahahahi"));
        System.out.println(countHi("ahhhbchidefhihellohiiiiworld"));
        System.out.println(countHi("kahkohkehkahkehkehkohkohkehkahkeh","keh"));
    }
    public static int countHi(String str) {

        str = str.trim();

        int count = 0;

        for (int i = 0; i < str.length()-1; i++) {

            if (str.substring(i,i+2).equalsIgnoreCase("hi")) {

                count++;
            }
        }
        return count;

    }public static int countHi(String str1, String str2){

        str1 = str1.trim();
        str2 = str2.trim();

        int count = 0;

        for (int i = 0; i <= str1.length() - str2.length(); i++) {

            if(str1.substring(i,i+str2.length()).equalsIgnoreCase(str2)){
                count++;
            }
        }
        return count;
    }
}
/*
Count Hi [method, loop, String]

	create a method that will accept a String and count how many times the word "hi" is found in the String. return the count

		ex:
			input: aahiahiaaahh
			output: 2
				"hi" was found 2 times

			input: ahhhbchidefhihellohiiiiworld
			output: 3
				"hi" was found 3 times

	extra: overload the method to search for any word, not just "hi"

 */

