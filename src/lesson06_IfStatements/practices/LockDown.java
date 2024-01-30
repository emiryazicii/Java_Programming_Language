package lesson06_IfStatements.practices;

public class LockDown {

    public static void main(String[] args) {

        int year = 2034;

        boolean valid = year >= 0, covid19 = year == 2020 || year == 2021;

        String temp = "";

        if (!valid) {
            temp = "Invalid Entry";
        }
        else if (covid19) {
            temp = "Stay at home\nPractice Java\nWear a Mask";
        }
        else {
            temp = "Party\nPractice Java\nTravel";
        }

        System.out.println(temp);
    }
}
/*
Lockdown [if else]

	Declare and assign a year variable

	Using the year determine if we were on lockdown and activities done on a daily basis

		if the year was 2020 or 2021 print:
			Stay at home
			Practice java
			Wear a mask

		if the year was any other year print:
			Party
			Practice Java
			Travel
 */

