package lesson08_Scanner.practices;

import java.util.Scanner;

public class PennyMachine {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter the cents amount : ");
        int cents = scanner.nextInt();

        if (cents <= 0) {
            System.out.println("Invalid Entry.Please enter an amount greater than 0.");
        } else {
            int dollars = cents / 100, centsAfterDollar = cents % 100,
                    quarters = centsAfterDollar / 25, centAfterQuarter = centsAfterDollar % 25,
                    dimes = centAfterQuarter / 10, centsAfterDime = centAfterQuarter % 10,
                    nickels = centsAfterDime / 5, centsAfterNickels = centsAfterDime % 5;

            if (dollars > 0) {
                System.out.println("Dollars: " + dollars);
            }
            if (quarters > 0) {
                System.out.println("Quarters: " + quarters);
            }
            if (dimes > 0) {
                System.out.println("Dimes: " + dimes);
            }
            if (nickels > 0) {
                System.out.println("Nickels: " + nickels);
            }
            if (centsAfterNickels > 0) {
                System.out.println("Pennies: " + centsAfterNickels);
            }
        }
        scanner.close();
    }
}
