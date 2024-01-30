package lesson08_Scanner.practices;

import java.util.Scanner;

public class MileToKilometer {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the mile length: ");

        double miles = input.nextDouble(),
                km = miles * 1.609;

        System.out.println(miles + " miles equals to " + km);

        input.close();
    }
}
/*
Create a class named MilesToKM, write a program that can convert Miles to KM
            Ex:
                Enter miles:
                10.0

                output:
                10.0 miles equal to 16.09 kilometers

 */

