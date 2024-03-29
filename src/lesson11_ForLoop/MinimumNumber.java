package lesson11_ForLoop;

import java.util.Scanner;

public class MinimumNumber {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int min = 2147483647;

        for (int i = 1; i <=5 ; i++) {

            System.out.println("Enter a number: ");
            int num = input.nextInt();

            if (num < min){// if the user entered entry is less than the current minimum number that we have
                min = num; // then user entered number should be the minimum number
            }
        }
        System.out.println(min);

        input.close();
    }
}
/*
Write a program that can ask the user to enter a number for 5 times and returns the minimum number
 */