package lesson08_scanner;

import java.util.Scanner;

public class ShippingAddress {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your full name:");
        String fullName = input.nextLine();

        System.out.println("Enter your building number:");
        int buildingNumber = input.nextInt();

        input.nextLine();

        System.out.println("Enter your Street name:");
        String StreetName = input.nextLine();

        System.out.println("Enter your city name:");
        String cityName = input.nextLine();

        System.out.println("Enter your state :");
        String state = input.nextLine();

        System.out.println("Enter your zipcode:");
        String zipCode = input.nextLine();

        System.out.println("Your shipping address is:\n\t\t" + fullName + "\n\t\t" + buildingNumber +
                " " + StreetName + "\n\t\t" + cityName + ", " + state + " " + zipCode);

        input.close();
    }
}
