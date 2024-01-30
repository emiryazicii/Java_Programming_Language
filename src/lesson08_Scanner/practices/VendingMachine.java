package lesson08_Scanner.practices;

import java.util.Scanner;

public class VendingMachine {

    public static void main(String[] args) {

        Scanner x = new Scanner(System.in);

        System.out.println("What would you like to get today?Please enter DRINK or SNACK ?");
        String selection = x.next();

        String temp = "";

        switch (selection) {
            case "DRINK":
                temp = "Drink Menu :WATER, COFFEE, SODA, ENERGY DRINK.";
                break;
            case "SNACK":
                temp = "Snack Menu :CHIPS , COOKIES , CARROTS.";
                break;
        }
        System.out.println(temp);

        System.out.println("Please enter what would you like to get.");
        x.nextLine();
        String selection2 = x.nextLine();

        double price;
        String temp2;

        switch (selection2) {
            case "WATER":
                price = 2.59;
                temp2 = "Your total is $" + price;
                break;
            case "COFFEE":
                price = 3.79;
                temp2 = "Your total is $" + price;
                break;
            case "SODA":
                price = 4.49;
                temp2 = "Your total is $" + price;
                break;
            case "ENERGY DRINK":
                price = 5.99;
                temp2 = "Your total is $" + price;
                break;
            case "CHIPS":
                price = 2.89;
                temp2 = "Your total is $" + price;
                break;
            case "COOKIES":
                price = 5.29;
                temp2 = "Your total is $" + price;
                break;
            default:
                price = 7.69;
                temp2 = "Your total is $" + price;
        }
        System.out.println(temp2);
        x.close();
    }
}
/*
Vending Machine [Scanner, conditional statements]

	Define a program that will act like a vending machine. This task will not have many details. I want you to try writing some code with this idea in mind
	Flow:
		ask if they want the drink options or snack options
			if they select the drink option show the menu of
			if they select the snack option show the menu of chips, cookies, carrots
		based in their selection display the price of the item
 */

