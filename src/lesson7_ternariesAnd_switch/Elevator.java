package lesson7_ternariesAnd_switch;

public class Elevator {

    public static void main(String[] args) {

        int floorNumber = 0;

        boolean valid = floorNumber >= 1 && floorNumber <= 3,
                firstFloor = floorNumber == 1,
                secondFloor = floorNumber == 2;

        String temp = "";

        if (!valid) {
            temp = "Invalid Floor" + floorNumber;
        } else if (firstFloor) {
            temp = "Floor 1 selected. Companies: Lobby, Verizon, Starbucks";
        } else if (secondFloor) {
            temp = "Floor 2 selected. Companies: Cydeo, NASA, Intelsat";
        } else {
            temp = "Floor 3 selected. Companies: Lyft, BofA, Stake house";
        }
        System.out.println(temp);

    }
}
/*
1. Create a class called Elevator. A variable named floorNumber is given, write a program that can display the floor info
			when floorNum is 1 -> print "Floor 1 selected. Companies: Lobby, Verizon, Starbucks"
			when floorNum is 2 -> print "Floor 2 selected. Companies: Cydeo, NASA, Intelsat"
			when floorNum is 3 -> print "Floor 3 selected. Companies: Lyft, BofA, Stake house"

			anything else: print "Invalid floor - 6"
 */