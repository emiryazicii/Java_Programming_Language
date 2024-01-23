package lesson13_nestedLoop;

public class FrequencyOfCharacters {

    public static void main(String[] args) {

        String str = "aabcccd",
                temp = ""; // a2b1c3d

        for (int j = 0; j < str.length(); j++) {

            char ch = str.charAt(j);
            int count = 0;

            for (int i = 0; i < str.length(); i++) {

                if (str.charAt(i) == ch) {
                    count++;
                }
            }
            if (temp.contains("" + ch)) {
                continue;
            }
            temp += ch + "" + count;
        }
        System.out.println(temp);
    }
}
/*
 Write a program that can find the frequency of the characters from a string

                Ex:
                        str = "aabcccd";

                        output:
                                a2b1c3d1



 */