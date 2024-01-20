package lesson8_ternariesAnd_switch;

public class TernariesIntro3 {

    public static void main(String[] args) {


        int score = 150;

        boolean valid = score >= 0 && score <= 100,
                passed = score >= 60;

        String temp = (!valid) ? "Invalid Entry" : (passed) ? "Passed" : "Failed";

        System.out.println(temp);

        System.out.println("----------------------------------------------------");


        int n = 3;

        boolean valid2 = n >= 1 && n <= 7,
                monday = n == 1, tuesday = n == 2, wednesday = n == 3,
                thursday = n == 4, friday = n == 5, saturday = n == 6;

        String temp2 = (!valid2) ? "Invalid Entry" :
                (monday) ? "Monday" : (tuesday) ? "Tuesday" :
                        (wednesday) ? "Wednesday" : (thursday) ? "Thursday" :
                                (friday) ? "Friday" : (saturday) ? "Saturday" : "Sunday";

        System.out.println(temp2);
    }
}
