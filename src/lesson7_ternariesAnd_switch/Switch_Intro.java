package lesson7_ternariesAnd_switch;

public class Switch_Intro {

    public static void main(String[] args) {

        char grade = 'B';

        switch (grade) {
            case 'A':
                System.out.println("Excellent");
                break;

            case 'B':
                System.out.println("Good Job");
                break;

            case 'C':
                System.out.println("Good");
                break;

            case 'D':
                System.out.println("Passed");
                break;

            case 'F':
                System.out.println("Failed");
                break;

            default :
                System.out.println("Invalid Entry");
        }
    }
}
