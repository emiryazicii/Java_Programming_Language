package lesson11_ForLoop.practices;

public class PrintTheShape {

    public static void main(String[] args) {

        String star = "* ",
                shape ="";

        for (int i = 0; i <= 5; i++) {
            shape += star ;
        }
        for (int i = 0; i <8 ; i++) {
            System.out.println("\t\t\t"+shape);
        }
    }
}
/*
1. Use a loop to print the following shape:

                * * * * * *
                * * * * * *
                * * * * * *
                * * * * * *
                * * * * * *
                * * * * * *
                * * * * * *
                * * * * * *
 */

