package lesson12_WhileLoop.practices;

import java.util.Scanner;

public class CydeoLogin {

    public static void main(String[] args) {

        String correctUsername = "Cydeo",
                correctPassword = "Cydeo123";

        int attempt = 0;

        Scanner input = new Scanner(System.in);

        while(true){

            System.out.println("Enter the username: ");
            String str = input.next();

            System.out.println("Enter the password: ");
            String psw = input.next();

            if(str.equals(correctUsername) && psw.equals(correctPassword)){

                System.out.println("Logged in.");
                break;
            } else  {

                System.err.println("Invalid username or password, please reenter.");
                attempt++;

            }
            if (attempt == 3){

                System.err.println("Your account is locked.");
                break;
            }
        }
        input.close();
    }
}
/*
7. you are writing a code for the log-in function of the Cydeo Application, assume that your credentials are:
                    username: Cydeo
                    password: Cydeo123

        Ask the user to enter their credentials.
                If credentials are matched, your program should print "Logged in."
                If the credentials are not matched, the program should allow the user to have three attempts to enter correct credentials and if all three attempts are failed, then print "Your account is lucked."
 */

