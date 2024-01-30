package lesson08_Scanner.practices;

import java.util.Scanner;

public class CentToDollars {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter cents amount: ");

        int cents = input.nextInt(),
                dollars = cents / 100 ,
                centsAfterDolLar = cents % 100 ;

        System.out.println(cents + " cents equal to: " + dollars + " dollars and " + centsAfterDolLar + " cents.");

        input.close();
    }
}
/*
Create a class named CentsToDollars, write a program that can convert cents to dollars
	if there is any remainder include them in the result as cents
            Ex:
                Enter cents
                225

                output:
                225 cents equal to: 2 dollars and 25 cents
 */

