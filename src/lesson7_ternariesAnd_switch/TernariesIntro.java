package lesson7_ternariesAnd_switch;

public class TernariesIntro {

    public static void main(String[] args) {

        int score = 85;

        String temp = "";

        boolean passed = score >= 60;

        if (passed) {
            temp = "Passed";
        } else {
            temp = "Failed";
        }
        System.out.println(temp);

        System.out.println("----------------------------------------------");


        String temp2 = (passed) ? "Passed" : "Failed";

        System.out.println(temp2);

        System.out.println("--------------------------------------------------");

        int age = 23;

        boolean eligible = age >= 21;

        String temp3 = (eligible) ? "Eligible" : "Ineligible";

        System.out.println(temp3);
    }
}
