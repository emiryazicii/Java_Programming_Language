package lesson13_NestedLoop.practices;

import java.util.Scanner;

public class ColorPicker {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter color 1: ");
        String color1 = input.nextLine().toLowerCase();
        System.out.println(color1+" added.");

        while (true){

            System.out.println("Enter color 2: ");
            String color2 = input.nextLine().toLowerCase();

            if (color1.equals(color2)){
                System.out.println(color1+" already selected.");
            }else{
                System.out.println(color2+" added.");
                while (true) {
                    System.out.println("Enter color 3: ");
                    String color3 = input.nextLine().toLowerCase();

                    if (color3.equals(color2)){
                        System.out.println(color2+" already selected.");
                    }else{
                        System.out.println(color3+" added.");
                        input.close();
                        System.out.println("Here are the colors you picked: "+color1+", "+color2+", "+color3);
                        return;
                    }
                }
            }
        }
    }
}
/*
T2ColorPicker [loop, Scanner, String]

    Create a program that will allow the user to select three unique colors.
    Ask the user to enter their colors one at a time. Verify the color hasn't been selected already. If the color is unique add it to the final selection otherwise tell the user the colors should be unique and allow them to reenter a different color. The number of iterations is not fixed

    Ex flow:
        Enter color 1:
            > red
        red added
        Enter color 2:
            > red
        red is already selected
        Enter color 2:
            > green
        green added
        Enter color 3:
            > red
        red is already selected
        Enter color 3:
            > green
        green is already selected
        Enter color 3:
            > orange
        orange added

        Here are the colors you picked: red, green, orange

 */

