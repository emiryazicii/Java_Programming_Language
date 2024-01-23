package lesson11_forLoop;

import java.util.Scanner;

public class MaximumNumber {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int max = -2147483648; // -25 and then 35 and eventually 40 .

        for (int i = 1; i <=5 ; i++) {
            System.out.println("Enter a number: ");
            int num = input.nextInt(); // -25, 35, 15, 40 , 0

            if (num > max){// if the user entered entry is greater than the current maximum number that we have
                max = num; // then user entered number should be the maximum number

            }
        }

        System.out.println("max = "+max);
    }
}
