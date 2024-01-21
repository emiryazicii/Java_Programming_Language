package lesson06_ifStatements;

public class IdentifyNumber {

    public static void main(String[] args) {

        double number = 0;

        boolean positive = number>0, // if the number is greater than zero , it's positive.
                negative = number<0, // if the number smaller than zero , it's negative.
                //  zero = number==0;    // if the number is equal to zero , it's zero.
                zero = !positive && !negative ; // if the number is not positive and not negative , then it's zero.

        System.out.println(number + " is positive number: " + positive);
        System.out.println(number + " is negative number: " + negative);
        System.out.println(number + " is zero: " + zero);

    }
}
