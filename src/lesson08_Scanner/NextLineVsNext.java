package lesson08_Scanner;

import java.util.Scanner;

public class NextLineVsNext {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your age: ");

        int age = input.nextInt();

        input.nextLine();

        System.out.println("Enter your full name: ");
        String fullName = input.nextLine();

        System.out.println("Your age is: " + age);
        System.out.println("Your name is: " + fullName);
    }
}
