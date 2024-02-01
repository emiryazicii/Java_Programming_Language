package lesson10_CustomMethods.practices;

public class Eligibility {

    public static void main(String[] args) {

        displayEligibility(19, true);
        displayEligibility(22, false);
        displayEligibility(18, false);
        displayEligibility(35, true);

    }

    public static void displayEligibility(int age, boolean isAmerican) {

        if (isAmerican) {
            if (age >= 21) {
                System.out.println("You are eligible to vote");
            } else {
                System.out.println("You are not eligible to vote.");
            }
        } else {
            System.out.println("You are not eligible to vote.");
        }

    }

}

/*
Create a method named eligibleToVote that takes two arguments:
        1. age (int)
        2. isAmerican (boolean)

    Then the method should determine if the person eligible to vote
        Ex:
            eligibleToVote(23, true)

        output:
            You are eligible to vote
 */

