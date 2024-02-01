package lesson11_ForLoop.practices;

public class SumOfDigits {

    public static void main(String[] args) {

        System.out.println(sumOfDigits("A1B2C3"));
        System.out.println(sumOfDigits("007JamesBond0123"));
        System.out.println(sumOfDigits("B2C3D4F5H11J"));
        System.out.println(sumOfDigits("111111111"));
        System.out.println(sumOfDigits("123456789123456789"));

    }
    public static int sumOfDigits(String str) {
        int sum = 0;

        for (int i = 0; i <= 9; i++) {
            char c = (char) (i + '0');

            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(j) == c) {
                    sum += i;
                }
            }
        }
        return sum;
    }
}
/*
6. Write a program that can return the sum of digits from a  string
             Ex:
                 input: A1B2C3

                 output:    6

             Hint: You need to get each of the character by using a loop
	             	To convert char to number:
						             	   '0' - 48   ==> 0
						             	   '1' - 48   ==> 1
 */

