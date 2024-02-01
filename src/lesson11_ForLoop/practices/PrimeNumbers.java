package lesson11_ForLoop.practices;

public class PrimeNumbers {

    public static void main(String[] args) {

        System.out.println(displayPrimeNumbers(500));

    }
    public static String displayPrimeNumbers(int number) {

        String pn = "";

        for (int i = 2; i <= number; i++) {

            pn += ", "+i;

            for (int j = 2; j <= number/2; j++) {

                if (i % j == 0 && i != j) {

                    pn = pn.replace(", "+i, "");

                }
            }
        }
        return pn.substring(2);
    }
}
/*
[IQ] Prime in range [nested loop, methods, conditional]

	create a method that will accept a number. Print out all the prime numbers in the range between 2 and the given number

	a number is a prime number when it is only divisible by 1 and itself

	ex:
		Input:
			50
		Output:
			2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47

 */

