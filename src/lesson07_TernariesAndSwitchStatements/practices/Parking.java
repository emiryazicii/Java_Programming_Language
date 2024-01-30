package lesson07_TernariesAndSwitchStatements.practices;

public class Parking {

    public static void main(String[] args) {

        double time = 23.59,
                normalFee = 7.5,
                doubleFee = normalFee * 2;

        boolean normalRateActive = time >= 6.00 && time < 13.00,
                doubleRateActive= time >= 13.00 && time < 24.00 || time >= 0.00 && time <= 5.00,
                outOfRange = time >=24.00 || time <0.00;

        String temp =(normalRateActive )? "Fee is: " + normalFee
                     :(doubleRateActive)? "Fee is: " + doubleFee : "";

        if(outOfRange){
            System.err.println("Error Occurred");
        }
        System.out.println(temp);
    }
}

/*
create a program that will define a time variable. Use a 24 hour format. Based on the given time determine the cost of parking in the city

		If the time is between 6-12:
			fee: 7.50

		if the time is between 13 - 23 or 0 - 5
			fee is 15

		extra: if the time is outside of the valid range (0-24) then output an error message
 */

