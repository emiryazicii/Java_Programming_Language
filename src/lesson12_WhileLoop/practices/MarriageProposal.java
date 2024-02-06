package lesson12_WhileLoop.practices;

import java.util.Scanner;

public class MarriageProposal {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        while (true){

            System.out.println("Will you marry me?");
            String answer = input.nextLine().toLowerCase();


            switch (answer){

                case "yes":
                    System.out.println("Congrats.");
                    input.close();
                    return;

                case "no":
                    System.out.println("Goodbye.");
                    input.close();
                    return;
                default:
                    System.err.println("Invalid answer, please re-enter");
            }
        }
    }
}
/*
.  Create a class named Marriage proposal and Write a program for the  marriage proposal program asking the user, "Will you marry me?"
    if the answer is yes, print "Congrats."
    if the answer is no, print "Goodbye"
    if the answer is neither yes nor no, print "Invalid answer, please re-enter" and repeat it until the user enters either yes or no
 */

