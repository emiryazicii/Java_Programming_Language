package lesson13_NestedLoop;

import java.util.Scanner;

public class CydeoLogin {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your username:");
        String username = input.next();

        System.out.println("Enter your password:");
        String password = input.next();

        if (username.equals("Cydeo") && password.equals("WoodenSpoon")) { // if the credentials are correct

            System.out.println("Logged in.");

        } else { // otherwise

            for (int i = 0; i < 3; i++) { // i : 0, 1 , 2

                if (i != 2 ){
                    System.err.println("Incorrect username or password , please reenter.");
                }else {
                    System.err.println("This is your last chance, please reenter your username and password.");
                }

                System.out.println("Enter your username:");
                username = input.next();

                System.out.println("Enter your password:");
                password = input.next();

                if (username.equals("Cydeo") && password.equals("WoodenSpoon")) {// if the user enters valid credentials

                    System.out.println("You are now logged in");
                    break;// exits the loop
                }
            }
            if (!(username.equals("Cydeo") && password.equals("WoodenSpoon"))) { // after all three attempts, if the user enter correct credentials.

                System.out.println("Your account is locked now.Please contact support team.");
            }
            input.close();
        }
    }
}
/*
 Create a class named CydeoLogIn. you are writing a code for the log-in function of the Cydeo Application, assume that your credentials are:
                    username: Cydeo
                    password: WoodenSpoon

        Ask the user to enter their credentials.
                If credentials are matched, your program should print "Logged in."

                If the credentials are not matched, the program should allow
                the user to have three attempts to enter correct credentials

                if all three attempts are failed, then print "Your account is lucked."

 */