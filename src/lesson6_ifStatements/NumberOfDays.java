package lesson6_ifStatements;

public class NumberOfDays {

    public static void main(String[] args) {

        int month = 5;

        boolean has28Days = month ==2;
        boolean has30Days = month ==4 || month ==6 || month ==9 || month ==11;
        boolean has31Days = !has28Days && !has30Days;

        String temp = "";

        if (has28Days){ temp = "28 Days";}

        if (has30Days){ temp = "30 Days";}

        if (has31Days){ temp = "31 Days";}

        System.out.println(temp);

    }
}
