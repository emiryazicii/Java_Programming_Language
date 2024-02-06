package lesson12_WhileLoop.practices;

import java.util.Scanner;

public class UntilNegative {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int sum = 0;

        while (true){

            System.out.println("Enter a num");
            int num = input.nextInt();

            sum += num;

            if (num < 0){

                break;
            }
        }
        System.out.println(sum);
        input.close();
    }
}
/*
5. Create a class named UntilNegative and Write a program that calculates the sum of numbers entered by the user until user enters a negative number.

 */

