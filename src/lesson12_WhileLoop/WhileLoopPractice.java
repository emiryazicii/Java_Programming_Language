package lesson12_WhileLoop;

import java.util.Scanner;

public class WhileLoopPractice {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your age: ");

        int age = input.nextInt();

        while(age <0 || age >150){ // while the age is invalid.

            System.err.println("Invalid age enter a valid age .");
            age = input.nextInt();
        }

        if (age >= 21){
            System.out.println("You are eligible.");
        }else {
            System.out.println("you are not eligible");
        }
    }
}
