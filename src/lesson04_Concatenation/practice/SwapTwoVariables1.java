package lesson04_Concatenation.practice;

public class SwapTwoVariables1 {

    public static void main(String[] args) {

        int x = 10,
                y = 15,
                z = x;

        x = y;
        y = z;

        System.out.println("x = " + x + "\ny = " + y);
    }
}
/*
Create a class named SwapTwoVariables1 and declare the following variables:
            x
            y
            z

    8.1 Write a program that swap variables x & y’ values by using a temporary variable z
        Ex:
              x = 10
              y = 15

        output:
                  x = 15
                  y = 10

 */

