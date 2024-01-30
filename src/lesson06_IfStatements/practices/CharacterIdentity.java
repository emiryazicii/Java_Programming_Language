package lesson06_IfStatements.practices;

public class CharacterIdentity {

    public static void main(String[] args) {

        char ch = '!';

        boolean digit = ch >= '0' && ch <= '9',
                alphabetic = (ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z'),
                special = !digit && !alphabetic;

        String temp = "";


        if (digit) {
            temp = "Digit";
        }

        if (alphabetic) {
            temp = "Alphabetic Character";
        }

        if (special) {
            temp = "Special Character";
        }

        System.out.println(temp);
    }
}
