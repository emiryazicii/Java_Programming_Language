package lesson09_String.practices;

import java.util.Scanner;

public class Name {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your name in this format: firstname/space/lastname ");
        String fn = input.nextLine().toLowerCase();
        input.close();

        String firstName = fn.substring(0,1).toUpperCase()+fn.substring(1,fn.indexOf(" ")),
                lastName = fn.substring(fn.indexOf(" ")+1,fn.indexOf(" ")+2).toUpperCase()+fn.substring(fn.indexOf(" ")+2),
                fullName = firstName+" "+lastName,
                initials = firstName.charAt(0)+lastName.substring(0,1);

        System.out.println("Full Name: "+fullName+"\nInitials: "+initials);
    }
}
/*
Name [Scanner, String methods]

	Create a program that will ask the user to enter their name. The name should be accepted as (first name + space + last name). The program will not be able to handle any other format

	Take the name and do two things:
		1) Print the name in correct formatting meaning the first letter of the first name and last name would be uppercase and the rest will be lowercase

		2) Print the initials of the person

 */

