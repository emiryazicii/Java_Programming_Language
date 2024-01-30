package lesson06_IfStatements.practices;

public class OverTime {

    public static void main(String[] args) {

        double hourlyRate = 67, numberOfHoursWorked = 41,
                overTimeRate = 1.5,
                overTimeHours = (numberOfHoursWorked - 40),
                overTimePay = overTimeHours * hourlyRate * overTimeRate,
                weeklyPay = hourlyRate * numberOfHoursWorked;

        boolean valid = numberOfHoursWorked <= 168 && numberOfHoursWorked >= 0 && hourlyRate > 0,
                overtimeNotActive = numberOfHoursWorked <= 40;

        String temp = "";

        if (!valid) {
            temp = "Invalid Entry";
        }
        else if (overtimeNotActive) {
            temp = "You worked " + numberOfHoursWorked +
                    " hours, so your total net pay is $" + weeklyPay;
        }
        else {
            temp = "Wow you worked " + numberOfHoursWorked +
                    " hours so you will get " + overTimeHours +
                    " hours of overtime. Your net pay is: $" + (weeklyPay + overTimePay);
        }
        System.out.println(temp);
    }
}

/*
Overtime [if else, operators, variables]

	Declare and assign the following variables
		hourly rate & number of hours worked

	Calculate your total net pay for the week. Also consider if any overtime should be paid. Overtime will be 1.5 times the normal rate and should be paid for every hour over 40.
	(if you worked 43 hours total, you will get 40 hours normal pay and 3 hours overtime pay)

	Output different messages based on overtime
		if normal hours were worked (40 hours or less):
			You worked $hours hours, so your total net pay is: $netPay

		if you worked overtime (more than 40 hours):
			Wow you worked $hours hours so you will get $overtime_hours of overtime. Your net pay is $netPay
 */

