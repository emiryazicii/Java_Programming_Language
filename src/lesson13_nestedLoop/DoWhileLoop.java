package lesson13_nestedLoop;

public class DoWhileLoop {

    public static void main(String[] args) {


        boolean condition = false;

        for (; condition; ) {

            System.out.println("Hello Cydeo --------- for for loop");
        }

        System.out.println("--------------------------------------------------------------");

        while (condition) {

            System.out.println("Hello Cydeo ------ for while loop");


        }

        System.out.println("-------------------------------------------------------------");

        do{

            System.out.println("Hello Cydeo ------ for Do & While loop");

        }while (condition);
    }
}
