package lesson08_Scanner.practices;

import java.util.Scanner;

public class Months {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number: ");

        int n = input.nextInt();

        boolean valid = n >= 1 && n <= 12,
                one = n == 1, two = n == 2, three = n == 3, four = n == 4,
                five = n == 5, six = n == 6, seven = n == 7, eight = n == 8,
                nine = n == 9, ten = n == 10, eleven = n == 11;

        String month = (!valid) ? "Invalid entry ! Enter a number between 1 to 12 ."
                : (one) ? "January" : (two) ? "February" : (three) ? "March" : (four) ? "April"
                : (five) ? "May" : (six) ? "June" : (seven) ? "July" : (eight) ? "August"
                : (nine) ? "September" : (ten) ? "October" : (eleven) ? "November" : "December";

        System.out.println("Result: " + month ) ;

        input.close();
    }
}
/*
MonthName
            3.1 Ask the user to enter a number
            3.2 Display the month name

 */

