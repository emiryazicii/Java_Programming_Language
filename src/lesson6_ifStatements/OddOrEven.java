package lesson6_ifStatements;

public class OddOrEven {

    public static void main(String[] args) {

        int number = 0;

        boolean even = number%2==0; // when we divide a number by 2 ,if the remainder is 0,it means the number is even.
        boolean odd = !even;  // If the number is even , it can't be odd at the same time.

        System.out.println(number + " is an even number: " + even);
        System.out.println(number + " is an odd number: " + odd);
    }
}
/*
1. Create a class named OddOrEven, and write a program that can identify if the given number is odd or even
			Ex:
				number = 20

			output:
				20 is an even number: true
				20 is an odd number: false

		Hint: even numbers are the numbers that are evenly divisible by 2 (remainder is zero)


 */