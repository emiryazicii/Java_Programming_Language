package lesson9_scanner;

public class NumberOfDays {

    public static void main(String[] args) {

        int month = 7;

        String temp = "";

        switch (month) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                temp = "31 Days";
                break;
            case 4: case 6: case 9: case 11:
                temp = "30 Days";
                break;
            case 2:
                temp = "28 Days";
                break;
            default:
                temp = "Invalid Entry";

        }
        System.out.println(temp);
    }
}
