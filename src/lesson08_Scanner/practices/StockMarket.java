package lesson08_Scanner.practices;

import java.util.Scanner;

public class StockMarket {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("How many total share do you have already? : ");

        int shares = input.nextInt();

        boolean valid = shares > 0;

        if (valid) {
            System.out.println("How much their total value in the stock market? : ");

            double value = input.nextDouble();

            System.out.println("Enter the name of the company you have the most share in: ");

            input.nextLine();

            String name = input.nextLine();

            System.out.println("Your total stock market holding is $" + value +
                    " which is made up for " + shares + " shares. " +
                    name + " is your company holdings.");
        }
        input.close();
    }
}
/*
Create a class named StockMarket:
        - Ask the user how many total shares they have already? (int)
            -> If the user gives 0 or give a negative number none of the rest condition should be executed

        - Ask the user how much their total value in the stock market is (double)
        - Ask the user to enter the name of the company they have the most shares in (String, multiple words)

        - Print in the following format:
            Ex:
                inputs: 100, 25000, Apple INC

            "Your total stock market holding is $25000 which is made up of 100 shares. Apple INC is your company holdings"

 */

