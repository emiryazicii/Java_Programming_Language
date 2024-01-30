package lesson06_IfStatements.practices;

public class BMI {

    public static void main(String[] args) {

        int massKg = 80;

        double  heightMeter = 1.73,
                bmi = ( massKg) / (heightMeter * heightMeter);

        boolean validKg = massKg < 185 && massKg > 40,
                validHeight = heightMeter > 1.2 && heightMeter < 2.5,
                underWeight = bmi < 18.5,
                normalWeight = bmi < 24.9 && bmi >= 18.5,
                overWeight = bmi < 29.9 && bmi >= 25;

        String temp = "";

        if (!validKg || !validHeight) {
            temp = "Sorry we cannot calculate the BMI with these metrics";
        } else if (underWeight){
            temp = "Underweight";
        } else if (normalWeight){
            temp = "Normal Weight";
        } else if (overWeight){
            temp = "Overweight";
        } else {
            temp = "Obese";
        }
        System.out.println(temp);
    }
}
/*
T5BMI [nested if, multibranch, operators]

	Create a program that will calculate your BMI. Declare and assign the values for a mass (in kilograms) and height (in meters)

	first check if the given values are valid
		- the kilograms needs to be more than 40 and less than 185

		- the height also needs to be more than 1.2 and less than 2.5

		-> if either of those is not met print: "Sorry we cannot calculate the BMI with these metrics"

	if the given values are valid then calculate and print the BMI using the following formula
		BMI = mass / height^2

    use these ranges for BMI for print the result
        Less than 18.5 — Underweight
        From 18.5 to 24.9 — Normal weight
        From 25 to 29.9 — Overweight
        More than or equal to 30 — Obese

    sample data to use:
        mass = 64
        height = 1.65
        -> Normal weight

        mass = 90
        height = 1.8
        -> Overweight

        mass = 50
        height = 1.7
        -> Underweight
 */

