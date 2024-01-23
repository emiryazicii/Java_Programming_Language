package lesson05_Operators;

public class EvenlyDivisible {

    public static void main(String[] args) {

        int number = 263;

        boolean divisibleBy2 = number % 2 == 0,
                // if the remainder of the number divided by 2 is equal to zero , then it's evenly divisible by 2.
                divisibleBy3 = number % 3 == 0,
                // if the remainder of the number divided by 3 is equal to zero , then it's evenly divisible by 3.
                divisibleBy5 = number % 5 == 0;
        // if the remainder of the number divided by 5 is equal to zero , then it's evenly divisible by 5.

        System.out.println(number + " is divisible by 2: " + divisibleBy2);
        System.out.println(number + " is divisible by 3: " + divisibleBy3);
        System.out.println(number + " is divisible by 5: " + divisibleBy5);

    }
}