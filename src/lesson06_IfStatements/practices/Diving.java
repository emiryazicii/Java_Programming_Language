package lesson06_IfStatements.practices;

public class Diving {

    public static void main(String[] args) {

        int oxygenTankLevel = 12;

        boolean valid = oxygenTankLevel >= 0 && oxygenTankLevel <= 100,
                levelTo100 = oxygenTankLevel >= 90 ,levelTo90 =  oxygenTankLevel >= 80,
                levelTo80 = oxygenTankLevel >= 70 , levelTo70 =  oxygenTankLevel >= 60 ,
                levelTo60 = oxygenTankLevel >= 50 ;

        String temp = "";

        if (!valid) {
            temp = "Invalid Entry";
        }
        else if (levelTo100) {
            temp = "Your tank is full";
        }
        else if (levelTo90) {
            temp = "A lot left to use";
        }
        else if (levelTo80) {
            temp = "Don't go too far";
        }
        else if (levelTo70) {
            temp = "Start to head back";
        }
        else if (levelTo60) {
            temp = "Be careful now you at at 50%";
        }
        else {
            temp = "Critical";
        }

        System.out.println(temp);
    }
}
/*

Diving [multibranch]

	Declare and assign a oxygen tank level. This level will be a whole number percentage, so 80 would represent 80% oxygen

	Check how much oxygen is left in the tank and output a corresponding message

		use these ranges:

           100 - 90: Your tank is full
			89 - 80: A lot left to use
			79 - 70: Don't go too far
			69 - 60: Start to head back
			59 - 50: Be careful now you at at 50%
			Less than 50: Critical
*/

