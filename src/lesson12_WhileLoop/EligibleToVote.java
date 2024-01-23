package lesson12_WhileLoop;

import java.util.Scanner;

public class EligibleToVote {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your age: ");
        int age = input.nextInt(); // valid age : 1 ~ 120

        while (age >120 || age < 0){ // while the age is not valid

            System.err.println("Invalid entry.Please reenter the age.");
            age = input.nextInt();

        }
        System.out.println("Are you an american citizen: YES/NO");
        String yesNo = input.next().toLowerCase();

        while (!(yesNo.equals("yes")|| yesNo.equals("no"))){

            System.err.println("Invalid entry please reenter");
            System.out.println("Are you an american citizen: YES/NO");
            yesNo = input.next().toLowerCase();
        }

        if (age >= 21 && yesNo.equals("yes")){

            System.out.println("You are eligible to vote");
        }else {
            System.out.println("You are not eligible to vote");
        }
    }
}
