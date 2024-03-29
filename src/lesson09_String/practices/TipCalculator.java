package lesson09_String.practices;

import java.util.Scanner;

public class TipCalculator {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Split or No split(Yes or No)?");
        String answer1 = input.next();

        System.out.println("Enter the number of people: ");
        int answer2 = input.nextInt();

        System.out.println("Enter the check amount: ");
        double answer3 = input.nextDouble();

        System.out.println("How was the service quality? (Excellent/Great/Good/Fair/Poor)");
        String answer4 = input.next();

        input.close();
        double tipRate = 0.01;

        if (answer4.toLowerCase().equals("excellent")) {
            tipRate = 0.25;
        } else if (answer4.toLowerCase().equals("great")){
            tipRate = 0.20;
        } else if (answer4.toLowerCase().equals("good")) {
            tipRate = 0.15;
        } else if (answer4.toLowerCase().equals("fair")) {
            tipRate = 0.10;
        }else if (answer4.toLowerCase().equals("poor")){
            tipRate = 0.05;
        }
        double totalTip = answer3 * tipRate,
                tipPerPerson = totalTip / answer2,
                totalToPay = answer3 + totalTip,
                totalPerPerson = totalToPay / answer2;

        if (answer1.equals("yes")) {
            System.out.println("Number of people entered: " + answer2 + "\nTotal per person: " + totalPerPerson + "\nTip per person: " + tipPerPerson);
        }else {
            System.out.println("Number of people entered: " + answer2 + "\nTotal to pay: " + totalToPay + "\nTotal tip: " + totalTip );
        }
    }
}
/*
Create a class called TipCalculator, and write a program for a tip calculator.
    There will be different service quality benchmarks that will determine the tip given.
    There will also the ability to calculate based on the number of people in the party and if there is a split of the bill or not.

        Poor = 5%, Fair = 10%, Good = 15%, Great = 20%, Excellent = 25%

    The program should ask the user to enter:
            - Split or No split (Yes or No),
             - Enter the number of people (number)
             - Enter the check amount (number)
             - Service Quality (String)

    And then it should display:
             Number of people entered
             Total to pay
             Total tip
             Total per person
             Tip per person:

        Ex:
            Split or No split (Yes or No)?
            YeS
            Enter the number of people
            4
            Enter the check amount:
            476
            How was the service quality? (Excellent/Great/Good/Fair/Poor)
            ExCElLeNt

            output:
                Number of people entered: 4
                Total to pay: 595.0
                Total tip: 119.0
                Total per person: 148.75
                Tip per person: 29.75
 */

