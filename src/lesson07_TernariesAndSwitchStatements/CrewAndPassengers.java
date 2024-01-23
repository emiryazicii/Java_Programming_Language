package lesson07_TernariesAndSwitchStatements;

public class CrewAndPassengers {

    public static void main(String[] args) {

        int numberOfPeople = 100;

        boolean valid = numberOfPeople == 50 || numberOfPeople == 75 || numberOfPeople == 100,
                if50 = numberOfPeople == 50 , if75 = numberOfPeople == 75 ;


        String temp = (!valid) ? "Invalid Entry" : (if50) ? "20 crew, 30 passengers" :
                (if75) ? "25 crew, 50 passengers" : "30 crew, 70 passengers";

        System.out.println(temp);

        System.out.println("--------------------------------------------------------");

        String temp2 = "";

        switch (numberOfPeople) {
            case 50:
                temp2 ="20 crew, 30 passengers";
                break;
            case 75:
                temp2 ="25 crew, 50 passengers";
                break;
            case 100:
                temp2 ="30 crew, 70 passengers";
                break;
            default:
                temp2 = "Invalid Entry";

        }
        System.out.println(temp2);
    }
}
/*
1. Create a class named CrewAndPassengers
		Given a number of people on the ship (int number)
		determine how many need to be crew members and how many can be passengers.
		Print how many of each type there should be.

                Total: 50  ====> 20 crew, 30 passengers
                Total: 75  ====> 25 crew, 50 passengers
                Total: 100 ====> 30 crew, 70 passengers
                Any other number of people on the ship is not valid

                Solution1: Use ternary. Do not use more than one println()
                Solution2: Use switch statement. Do not use more than one println()
 */