package lesson06_IfStatements.practices;

public class CharCase {

    public static void main(String[] args) {

        char letter = 'G',
                char1 = letter,
                char2 = ++char1,
                char3 = ++char2;

        boolean printNext3 = letter >= 'a' && letter <= 'w' || letter >= 'A' && letter <= 'W',
                loverCase = letter >= 'a' && 'z' >= letter,
                upperCase = letter >= 'A' && 'Z' >= letter;

        String temp = "";

        if (printNext3 && loverCase) {
            temp = letter + " is lovercase\nThe next three chars are: " + char1 + ", " + char2 + ", " + char3;

        } else if (printNext3 && upperCase) {
            temp = letter + " is uppercase\nThe next three chars are: " + char1 + ", " + char2 + ", " + char3;

        } else if (!printNext3 && loverCase) {
            temp = letter + " is lovercase\ntoo close to the end";
        } else {
            temp = letter + " is uppercase\ntoo close to the end";
        }

        System.out.println(temp);
    }
}
/*
T2CharCase [variables, if statement, operators]

    Create a program that will define a char variable, which will only be defined as an alphabetical letter. The character can be defined in uppercase or lowercase and we want to determine which case it is

    Part 2: also print the next 3 characters after the given character, but only print them if they will not go past z or Z

    Output in this format:
        $character is $uppercase_or_lowercase
        The next 3 chars are: c1, c2, c3

        ex:
            'm'
            m is lowercase
            The next 3 chars are: n, o, p

            'Y'
            Y is uppercase
            too close to the end

 */

