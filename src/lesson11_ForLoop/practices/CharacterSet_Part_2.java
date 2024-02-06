package lesson11_ForLoop.practices;

public class CharacterSet_Part_2 {

    public static void main(String[] args) {

        System.out.println(displayCharSequence("special"));
        System.out.println(displayCharSequence("digit"));
        System.out.println(displayCharSequence("lowercase"));
        System.out.println(displayCharSequence("uppercase"));
    }
    public static String displayCharSequence(char startingChar , char endingChar){

        String temp = "";
        for (char i = startingChar; i <= endingChar ; i++) {

            temp +=""+i;
        }
        return temp ;
    }
    public static String displayCharSequence(String definition) {
        String temp = "";
        switch (definition.toLowerCase()) {
            case "uppercase":
                temp = displayCharSequence('A', 'Z');
                break;
            case "lowercase":
                temp = displayCharSequence('a', 'z');
                break;
            case "digit":
                temp = displayCharSequence('0', '9');
                break;
            case "special":
                temp = displayCharSequence('!', '.');
                break;
        }
        return temp;
    }
}
/*
T1CharacterSet part 2 [methods, loops, overloading]

    Create a method (overloading the method from part 1) that has a String parameter and returns a String.
    Based on the given String a different set of characters will be returned
    use these to determine which set of characters is returned:

    uppercase -> ABCDEFGHIJKLMNOPQRSTUVWXYZ
    lowercase -> abcdefghijklmnopqrstuvwxyz
    digit -> 123456789
    special -> !"#$%&'()*+,-.

    so if the method is called with the argument "digit" then the method will return the String "123456789"
 */

