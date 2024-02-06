package lesson13_NestedLoop.practices;

public class ShapeAlternative {

    public static void main(String[] args) {

        for (int i = 1; i <= 10; i++) {

            for (int j = 1; j <= i; j++) {

                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
/*
1. Use a nested loop to print the following shape
*
* *
* * *
* * * *
* * * * *
* * * * * *
* * * * * * *
* * * * * * * *
* * * * * * * * *
* * * * * * * * * *
 */

