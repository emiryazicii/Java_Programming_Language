package lesson06_IfStatements.practices;

public class PosNegZero {

    public static void main(String[] args) {

        int number = -12;

        if (number > 0) {
            System.out.println(number + " is a positive number.");
        }

        if (number < 0) {
            System.out.println(number + " is a negative number.");
        }

        if (number == 0) {
            System.out.println(number + " is zero.");
        }
    }
}
