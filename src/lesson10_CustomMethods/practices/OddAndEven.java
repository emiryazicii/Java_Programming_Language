package lesson10_CustomMethods.practices;

public class OddAndEven {

    public static void main(String[] args) {

        System.out.println(isOdd(23));
        System.out.println(isEven(22));
    }

    public static boolean isOdd(int number) {

        return (number % 2 != 0) ;
    }

    public static boolean isEven(int number) {

        return !isOdd(number);
    }
}
/*
1. Create a method named isOdd, that can return true if a number is an odd number, otherwise returns false

2. Create a method named isEven, that can return true if a number is an even number, otherwise returns false
 */

