package lesson11_ForLoop;

public class ForLoopPractice {

    public static void main(String[] args) {

        for (int i = 10; i >= 5; i--) {

            System.out.println("Cydeo");

        }
        System.out.println("------------------------------------");

        int sum = 0;


        for (int a = 1; a <= 100; a++) {

            sum += a;

        }

        System.out.println(sum);

        System.out.println("------------------------------------------------------------");

        for(char b = 'A'; b <= 'Z'; b++){

            System.out.print(b+" ");

        }
        System.out.println();

        System.out.println("Hello");

        System.out.println("---------------------------------------------------------------");

        for (char c = 'Z'; c >= 'A'; c--){
            System.out.print(c+" ");
        }
    }
}
