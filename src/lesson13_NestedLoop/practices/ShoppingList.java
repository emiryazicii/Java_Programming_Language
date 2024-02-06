package lesson13_NestedLoop.practices;

import java.util.Scanner;

public class ShoppingList {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String shoppingList = "";
        int itemNumber = 1;

        do {
            System.out.println("Enter the item name: ");
            String itemName = input.nextLine();
            shoppingList += itemNumber + "- " + itemName + "\n";

            while (true) {
                System.out.println("Would you like to add more items? ");
                String answer = input.nextLine().toLowerCase();

                if (answer.equals("yes")) {
                    itemNumber++;
                    break;
                } else if (answer.equals("no")) {
                    System.out.println("Shopping List:\n" + shoppingList);
                    input.close();
                    return;
                } else {
                    System.err.println("Invalid entry, please reenter!");
                }
            }
        } while (true);
    }
}


/*
Shopping List [do while, String]

	create a program that create a shopping list for the user. The program will ask the user to enter the items one by one.

	the flow:
		ask the user for the item
		add item to the shopping list
		ask user if they want to add more items

	when the user is done creating the list print it
 */

