package lesson06_IfStatements.practices;

public class AutoGreeting {

    public static void main(String[] args) {

        int hour = 9;

        boolean isAm = true,
                isPm = false,
                goodMorning = (isAm && hour >= 6 && hour <= 11),
                goodEvening = (isPm && hour <= 5) || (isPm && hour == 12);

        String temp = "";

        if (goodMorning) {
            temp = "Good Morning";
        } else if (goodEvening) {
            temp = "Good Evening";
        } else {
            temp = "Good Night";
        }
        System.out.println(temp);

    }
}
/*
T4AutoGreeting [multibranch, operators]

    create a program that will define an hour variable and a boolean for am or pm (am = true, pm = false)
    using the given values to determine what message should be output:
    if the hours are from 6 am - 11 am, print: Good morning
    if the hours are from 12 pm - 5 pm, print: Good evening
    if the hours are from 6 pm - 11 pm or 12 am - 5 am print: Good night
 */

