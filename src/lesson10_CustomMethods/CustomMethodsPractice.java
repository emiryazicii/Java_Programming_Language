package lesson10_CustomMethods;

public class CustomMethodsPractice {

    public static void main(String[] args) {

        maxNum(10.5, 52.856);
        System.out.println("-----------------------------------------");

        maxNum(50_000, 61_000);
        System.out.println("-------------------------------------------");

        maxNum(-200, -78);
        System.out.println("-----------------------------------");

        initial("emir","yazici");

    }

    public static void maxNum(double num1, double num2) {

        if (num1 > num2) {
            System.out.println(num1 + " is the maximum number");
        } else if (num2 > num1) {
            System.out.println(num2 + " is the maximum number");
        } else {
            System.out.println("Numbers are equal");
        }
    }

    public static void initial(String firstname, String lastname) {

        String initials = firstname.substring(0,1).toUpperCase() + "." + lastname.substring(0,1).toUpperCase();

        System.out.println(initials);
    }
}
