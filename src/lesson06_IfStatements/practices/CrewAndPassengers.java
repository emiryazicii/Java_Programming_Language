package lesson06_IfStatements.practices;

public class CrewAndPassengers {

    public static void main(String[] args) {

        int totalPeople = 50;
        int crew = 0, passenger = 0;

        boolean validEntry = totalPeople == 50 || totalPeople == 75 || totalPeople == 100,
                ifTotalPeople50 = totalPeople == 50,
                ifTotalPeople75 = totalPeople == 75;

        String temp = "";

        if (!validEntry) {
            temp = "Invalid Entry.";
        } else if (ifTotalPeople50) {
            crew = 20;
            passenger = 30;
            temp = crew + " crew " + passenger + " passengers on the board.";
        } else if (ifTotalPeople75) {
            crew = 25;
            passenger = 50;
            temp = crew + " crew " + passenger + " passengers on the board.";
        } else {
            crew = 30;
            passenger = 70;
            temp = crew + " crew " + passenger + " passengers on the board.";
        }

        System.out.println(temp);
    }
}
/*
1. Create a class called CrewAndPassenger, Given a number of people on the ship (int number), determine how many need to be crew members and how many can be passengers. Print how many of each type there should be.

            Total: 50  ====> 20 crew, 30 passengers
            Total: 75  ====> 25 crew, 50 passengers
            Total: 100 ====> 30 crew, 70 passengers
            Any other number of people on the ship is not valid

            NOTE: MUST USE NESTED IF. DO NOT USE MORE THAN ONE PRINT STATEMENT

 */

