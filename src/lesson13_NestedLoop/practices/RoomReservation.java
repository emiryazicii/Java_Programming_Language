package lesson13_NestedLoop.practices;

import java.util.Scanner;

public class RoomReservation {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        while(true) {

            System.out.println("Do you want to reserve a room ?");
            String yesOrNo = input.nextLine().toLowerCase();

            if (yesOrNo.equals("yes")) {

                while(true) {

                    System.out.println("Which type of room you want to reserve?");
                    String roomType = input.nextLine().toLowerCase();

                    switch (roomType) {

                        case "king bed":
                            System.out.println("King Bed room is 120$ a night.");
                            input.close();
                            return;
                        case "queen bed":
                            System.out.println("Queen Bed room is 100$ a night");
                            input.close();
                            return;
                        case "single bed":
                            System.out.println("Single Bed room is 80$ a night");
                            input.close();
                            return;
                        default:
                            System.err.println("Invalid entry, please reenter.");
                    }
                }
            }else if (yesOrNo.equals("no")){
                System.out.println("Have a nice day.");
                input.close();
                return;
            }else {
                System.err.println("Invalid entry, please reenter.");
            }
        }
    }
}
/*
8. Create a class called RoomReservation, write a program for the room reservation, your program asks the user wants to reserve a room.
    	if user entered yes, then ask which type of room the user wants to reserve. if user entered no, print "have a nice day"
    			(if user entered any invalid answer (other than yes/no) ask user to reenter until user provides a valid entry)

	            King Bed ==> 120$
	            Queen Bed ==> 100$
	            single Bed ==> 80$

            the program should be able to display the room he/she reserved and total price of the room.

            (if the user selected an invalid room, ask the user to reselect the room until user provides a valid entry)

 */

