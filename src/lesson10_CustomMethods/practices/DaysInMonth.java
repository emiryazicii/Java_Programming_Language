package lesson10_CustomMethods.practices;

public class DaysInMonth {

    public static void main(String[] args) {


        displayDaysInTheMonth("FebRUAry");
        displayDaysInTheMonth("mARch");
        displayDaysInTheMonth("apRIL");
        displayDaysInTheMonth("auGusT");
    }

    public static void displayDaysInTheMonth(String month) {

        switch (month.toLowerCase()) {
            case "january":
            case "march":
            case "may":
            case "july":
            case "august":
            case "october":
            case "december":
                System.out.println(month.toUpperCase().charAt(0) + month.toLowerCase().substring(1) + " has 31 days.");
                break;
            case "april":
            case "june":
            case "september":
            case "november":
                System.out.println(month.toUpperCase().charAt(0) + month.toLowerCase().substring(1) + " has 30 days.");
                break;
            case "february":
                System.out.println(month.toUpperCase().charAt(0) + month.toLowerCase().substring(1) + " has 28 days.");
                break;
        }
    }
}
/*
Create a method that can print how many days a month has
    Ex:
        month("jUNe")

        output:
            June has 30 days
 */


