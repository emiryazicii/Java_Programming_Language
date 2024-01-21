package lesson9_string;

import java.util.Scanner;

public class EmployeeInfo {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your full name:");
        String fullName = input.nextLine();

        System.out.println("Enter your age:");
        byte age = input.nextByte();

        System.out.println("Enter your gender:");
        String gender = input.next();

        input.nextLine();
        System.out.println("Enter your company name:");
        String companyName = input.nextLine();

        System.out.println("Enter your job title:");
        String jobTitle = input.nextLine();

        System.out.println("Enter your salary:");
        int salary = input.nextInt();

        System.out.println(fullName + "\n" + age + "\n" + gender + "\n" + companyName + "\n" + jobTitle + "\n" + salary);

        input.close();

    }
}
/*
. Create a class named EmployeeInfo and Ask the user to:
	        2.1 Enter your full name ( nextLine() )
	        2.2 Enter your age ( nextByte())
	        2.3 Enter your gender ( next().charAt(0) )
	        2.4 Enter your company name ( nextLine() )
	        2.5 Enter your job title ( nextLine() )
	        2.6 Enter your salary (nextDouble() )

	        Display:
	            Employee's name
	            Employee's age
	            Employee's gender
	            Company name
	            Employee's job title
	            Employee's salary
*/