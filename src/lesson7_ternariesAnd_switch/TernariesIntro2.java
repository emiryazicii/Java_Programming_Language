package lesson7_ternariesAnd_switch;

public class TernariesIntro2 {

    public static void main(String[] args) {


        int number = 250;

        boolean positive = number > 0,
                negative = number < 0;

        String temp = (positive) ? "Positive" : (negative) ? "Negative" : "zero";

        System.out.println(temp);

        System.out.println("-------------------------------------------------------------");


        int num = 3;

        boolean monday = num == 1, tuesday = num == 2,
                wednesday = num == 3, thursday = num == 4,
                friday = num == 5, saturday = num == 6;

        String temp2 = (monday) ? "Monday" : (tuesday) ? "Tuesday" :
                (wednesday) ? "Wednesday" : (thursday) ? "Thursday" :
                        (friday) ? "Friday" : (saturday) ? "Saturday" : "Sunday";


        System.out.println(temp2);

        System.out.println("-----------------------------------------------------------------");


        int n = 8;

        boolean january = n == 1, february = n == 2, march = n == 3,
                april = n == 4, may = n == 5, june = n == 6,
                july = n == 7, august = n == 8, september = n == 9,
                october = n == 10, november = n == 11;

        String temp3 = (january) ? "January" : (february) ? "February" : (march) ? "March" : (april) ? "April" :
                (may) ? "May" : (june) ? "June" : (july) ? "July" : (august) ? "August" : (september) ? "September" :
                        (october) ? "October" : (november) ? "November" : "December";

        System.out.println(temp3);
    }
}
