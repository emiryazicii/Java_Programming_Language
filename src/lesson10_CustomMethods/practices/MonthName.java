package lesson10_CustomMethods.practices;

public class MonthName {

    public static void main(String[] args) {


        displayMonthName(3);
        displayMonthName(5);
        displayMonthName(7);
        displayMonthName(12);
        displayMonthName(15);

    }

    public static void displayMonthName(int number) {
        if (number<=12 && number>0) {

            String monthName = (number == 1) ? "January" : (number == 2) ? "February"
                    : (number == 3) ? "March" : (number == 4) ? "April"
                    : (number == 5) ? "May" : (number == 6) ? "June"
                    : (number == 7) ? "July" : (number == 8) ? "August"
                    : (number == 9) ? "September" : (number == 10) ? "October"
                    : (number == 11) ? "November" : "December";

            System.out.println(monthName);
        } else {
            System.err.println("Invalid Number");
        }
    }
}
/*
 Create a method named monthName that can display the name of the month based on the given number to the method, if the number is invalid, then the method should print the error message "Invalid Number"
    Ex:
        monthName(6)

        output:
            June
 */

