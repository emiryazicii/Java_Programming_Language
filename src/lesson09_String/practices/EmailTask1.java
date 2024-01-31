package lesson09_String.practices;

import java.util.Scanner;

public class EmailTask1 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your email address: ");
        String email = input.nextLine();

        input.close();

        if (email.contains("_")) {

            String name = email.substring(0, email.indexOf("_"));
            String lastname = email.substring(email.indexOf("_")+1, email.indexOf("@"));
            String domain = email.substring(email.indexOf("@")+1);

            System.out.println(lastname + "_" + name + "@" + domain);

        } else {

            System.out.println(email);
        }
    }
}
/*
Create a class calledEmailTask1.
   Assume that email address is constructed by person's first name and followed by an underscore and last name.

    Write a program that can swap first name with last name in the email (Separated by an underscore).
    If the email doesn't contain an underscore print the given input email.

        Ex:
            input: mike_tyson@gmail.com
            output: tyson_mike@gmail.com
 */
