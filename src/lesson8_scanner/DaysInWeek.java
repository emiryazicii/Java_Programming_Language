package lesson8_scanner;

import java.util.Scanner;

public class DaysInWeek {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the day number: ");

        // int num = new Scanner(System.in).nextInt()

        int num = input.nextInt();

        boolean valid = num >= 1 && num <= 7,
                one = num == 1, two = num == 2, three = num == 3, four = num == 4,
                five = num == 5, six = num == 6;

        String day = "";

        day = (!valid) ? "Invalid" : (one) ? "Monday" : (two) ? "Tuesday" : (three) ? "Wednesday" :
                (four) ? "Thursday" : (five) ? "Friday" : (six) ? "Saturday" : "Sunday";

        System.out.println(day);

        input.close();
    }
}
