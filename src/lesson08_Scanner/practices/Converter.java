package lesson08_Scanner.practices;

import java.util.Scanner;

public class Converter {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Choose your conversion option:\n1)inches to centimeters\n2)pounds to kilograms" +
                "\n3)fahrenheit to celsius\n4)feet to meters\n5)feet to inches\n6)gallons to liters");
        int respond = input.nextInt();

        System.out.println("Enter the base value:");
        double respond2 = input.nextDouble();

        input.close();

        String temp = "";

        switch (respond) {
            case 1:
                temp = respond2 + " inches equal to : " + respond2 * 2.4 + " centimeters.";
                break;
            case 2:
                temp = respond2 + " pounds equal to : " + respond2 * 0.454 + " kilograms.";
                break;
            case 3:
                temp = respond2 + " fahrenheit equals to : " + (respond2 - 32)/1.8 + " celsius.";
                break;
            case 4:
                temp = respond2 + " feet equals to : " + respond2*0.3048 + " meters.";
                break;
            case 5 :
                temp = respond2 + " feet equals to : " + respond2*12 + " inches.";
                break;
            case 6:
                temp = respond2 + " gallons equal to : " + respond2* 3.785 + " litres.";
        }
        System.out.println(temp);
    }
}
/*
T5Converter [switch, Scanner, variables, operators]

	create a program that can help the user convert between different unit types. Create a menu that will show the options by numbers (ie 1. inches to centimeters), so if the user picks 1 it will be converting from inches to centimeters. After asking for the conversion operation ask the user the value for the base number (in this example inches)

	sample menu:
		1. inches to centimeters		[formula: inches * 2.54]
		2. pounds to kilograms			[formula: pounds * 0.454]
		3. Fahrenheit to Celsius		[formula: (fahrenheit - 32) / 1.8]
		4. feet to meters			    [formula: feet * 0.3048]
		5. feet to inches				[formula: feet * 12]
		6. gallons to liters			[formula: gallon * 3.785]

----------------------------------------------------------------------------------------
 */

