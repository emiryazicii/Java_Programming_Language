package lesson10_CustomMethods.practices;

public class DaysNames {

    public static void main(String[] args) {

        displayDays(2);
        displayDays(4);
        displayDays(7);
        displayDays(21);

    }
    public static void displayDays(int number) {

        if (number > 0 && number <= 7) {

            String day = (number == 1) ? "Monday" : (number == 2) ? "Tuesday"
                    : (number == 3) ? "Wednesday" : (number == 4) ? "Thursday"
                    : (number == 5) ? "Friday" : (number == 6) ? "Saturday"
                    : "Sunday";

            System.out.println(day);

        } else {

            System.err.println("Invalid Number");
        }
    }
}
/*
Create a method named day that can display the name of the day based on the given number to the method, if the number is invalid, then the method should print the error message "Invalid Number"
    Ex:
        day(5)

        output:
            Friday

 */

