package lesson11_ForLoop;

public class ContinueStatement {

    public static void main(String[] args) {

        for (int i = 1; i < 6 ; i++) {

            if (i == 2){

                continue;
            }
            System.out.println(i);
        }

        System.out.println("-----------------------------------");

        for (int i = 10; i <21 ; i++) {

            if (i % 2 == 0){ // if i is even

                continue;// skips the current iteration

            }

            System.out.println(i);
        }

        System.out.println("-----------------------------------------------");

        for (char i = 'A'; i <= 'G' ; i++) {

            if (i == 'B' || i == 'E'){

                continue;

            }
            System.out.println(i);
        }

        System.out.println("----------------------------------------------------");

        // print all the even number between 50 ~ 100

        for (int i = 50; i <101 ; i++) {

            if (i % 2 == 0) {

                System.out.print(i+" ");
            }
        }

        System.out.println();

        //50,52,54,56.......100
        for (int i = 50; i <101 ; i += 2) {

            System.out.print(i+" ");
        }

        System.out.println();

        for (int i = 50; i < 101 ; i++) {

            if (i % 2 != 0){

                continue;

            }
            System.out.print(i+" ");

        }
        System.out.println();
    }
}
