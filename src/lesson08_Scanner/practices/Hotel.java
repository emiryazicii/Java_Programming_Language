package lesson08_Scanner.practices;

import java.util.Scanner;

public class Hotel {

    public static void main(String[] args) {

        Scanner x = new Scanner(System.in);

        System.out.println("Welcome to the Java Hotel.\nHow many days will you stay?");
        int days = x.nextInt();

        System.out.println("How many people in your party?");
        int people = x.nextInt();

        int price ;
        String roomType ;
        String temp ;

        switch (people) {
            case 1: roomType = "single room"; price = (days * 100);
                temp = "We have a " + roomType + " ready for " + people +
                        ". Your total price is: " + price + ".";
                break;
            case 2: roomType = "double room";price = (days * 125);
                temp = "We have a " + roomType + " ready for " + people +
                        ". Your total price is: " + price + ".";
                break;
            case 3: case 4 : roomType = "large room";price = (days * people * 50);
                temp = "We have a " + roomType + " ready for " + people +
                        ". Your total price is: " + price + ".";
                break;
            case 5 : case 6 : roomType = "suite";price = (days * 1000);
                temp = "We have a " + roomType + " ready for " + people +
                        ". Your total price is: " + price + ".";
                break;
            default:
                temp = "Sorry, " + people +  " is not a valid group size.";
        }
        System.out.println(temp);

        x.close();
    }
}
/*
Hotel [scanner, conditional, operators]

	Create a program that will allow you to check into a hotel. When checking in some information will be gathered and used to determine the information about the room and price

	Go through the following flow:

		Welcome to the Java Hotel
		How many days will you stay
		-> read number of days from console
		How many people are in your party
		-> read number of people from console

	In addition, declare these variables:
		price, room type

	Use the information gathered to assign a room to the guests and print the information

	Data:

		people 1 | single room | price: number of days staying * 100
		people 2 | double room | price: number of days staying * 125
		people 3 or 4 | large room | price: number of days staying * number of people * 50
		people 5 or 6 | suite | price: number of days staying * 1000

		any other number of people is invalid and should output:
			sorry $number_of_people is not a valid group size

	------------------------------------------------------------------------
 */

