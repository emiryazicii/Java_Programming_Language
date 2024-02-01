package lesson11_ForLoop.practices;

import java.util.Scanner;

public class PositiveNegative {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int posNumCount = 0,
                negNumCount = 0;

        for (int i = 1; i <=5 ; i++) {

            System.out.println("Enter the number "+ i );
            double num = input.nextDouble();


            if (num > 0){

                posNumCount++;
            }else if (num < 0){

                negNumCount++;
            }
        }
        System.out.println(posNumCount + " positive and "+ negNumCount + " negative");
        input.close();
    }
}
/*
 Create a class named PositiveNegative and write a program that asks user to enter number for 5 times, and print how many positive and negative numbers user entered
			Ex:
				Inputs:
					10
					20
					-1
					0
					3

				Output:
					3 positive and 1 negative
 */

