package lesson08_Scanner.practices;

import java.util.Scanner;

public class Alcohol {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your age: ");

        int age = input.nextInt();

        boolean valid = age >= 21;

        String eligibility = (valid) ? "You are eligible to buy alcohol."
                : "Sorry, you are not eligible to buy alcohol.";

        System.out.println(eligibility);

        input.close();
    }
}
/*
2. Eligible or not Eligible to buy alcohol
            2.1 Ask the user to enter his/her age
            2.2 write a program that can check if the person eligible to buy alcohol

 */

