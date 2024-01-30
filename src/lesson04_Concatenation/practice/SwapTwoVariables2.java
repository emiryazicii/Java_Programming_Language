package lesson04_Concatenation.practice;

public class SwapTwoVariables2 {

    public static void main(String[] args) {

        int x = 10,
                y = 15;

        x = x + y;
        y = x - y;
        x = x - y;

        System.out.println("x = " + x + "\ny = " + y );
    }
}
/*
 Create a class named SwapTwoVariable2 and declare the following variables:
            x
            y

    9.1 Write a program that swap variables x & y’ values without using any temporary variables
        Ex:
              x = 10
              y = 15

        output:
                  x = 15
                  y = 10


 */

