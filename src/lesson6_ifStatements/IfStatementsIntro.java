package lesson6_ifStatements;

public class IfStatementsIntro {

    public static void main(String[] args) {

        double number = -12.3;

        boolean positive = number > 0;
        boolean negative = number < 0;
        boolean zero = number == 0;

        if (positive) {

            System.out.println(number + " is positive number");
        }

        if (negative) {
            System.out.println(number + " is negative number");
        }

        if (zero) {
            System.out.println(number + " is number zero");
        }

        System.out.println("----------------------------------------------------------");

        double num = 13.5;

        if (num > 0) {

            System.out.println(num + " is positive number");
        }
        if (num < 0) {

            System.out.println(num + " is negative number");
        }

        if (num == 0) {

            System.out.println(num + " is number zero");

        }
    }
}
