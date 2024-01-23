package lesson10_CustomMethods;

public class CustomMethodsWithParameters {

    public static void main(String[] args) {

        oddOrEven(12);

        System.out.println("------------------------");

        oddOrEven(23);

        int num1 = 100;
        oddOrEven(num1);

        int num2 = 35;
        oddOrEven(num2);

        int num3 = 79;
        oddOrEven(num3);

        int num4 = 39;
        oddOrEven(num4);

        System.out.println("----------------------------");

        eligibility(25);

        System.out.println("-----------------------------");

        oddEvenZero(562);

        System.out.println("------------------------------");

        grade(56);

        System.out.println("-----------------------------------------");

        oddEvenZero(0);
    }

    // the method takes an argument number, and verifies if the number is odd or even number
    public static void oddOrEven(int number) {

        if (number % 2 == 0) {
            System.out.println(number + " is an even number");
        } else {
            System.out.println(number + " an odd number");
        }
    }
    public static void eligibility(int age) {

        if (age >= 21) {
            System.out.println("Eligible");
        } else {
            System.out.println("Not eligible");
        }

    }
    public static void oddEvenZero(int number) {

        if (number % 2 == 0) {
            System.out.println(number + " is an even number");
        } else if (number % 2 != 0) {
            System.out.println(number + " is an odd number");
        } else {
            System.out.println(number + " is zero");
        }
    }
    public static void grade(int score) {

        if (score >= 90) {
            System.out.println("A");
        } else if (score >= 80) {
            System.out.println("B");
        } else if (score >= 70) {
            System.out.println("C");
        } else if (score >= 60) {
            System.out.println("D");
        } else {
            System.out.println("F");
        }
    }
}
