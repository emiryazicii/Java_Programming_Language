package lesson08_scanner;

import java.util.Scanner;

public class DaysInMonths {

    public static void main(String[] args) {

        int month = new Scanner(System.in).nextInt();

        boolean isValid = month >0 && month <= 12 ;

        if(!isValid){ // if the month is invalid
            System.err.println("Invalid month");
            return;
        }
        switch (month){ // 1- 12
            case 2:
                System.out.println("28 Days");
                break;
            case 4: case 6: case 9: case 11:
                System.out.println("30 Days");
                break;
            default:
                System.out.println("31 Days");
        }
    }
}
