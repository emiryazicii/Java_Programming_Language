package lesson08_Scanner.practices;

import java.util.Scanner;

public class SpeedLimit {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your current speed: ");

        int currentSpeed = input.nextInt(),
                speedLimit = 35,
                overLimit = (currentSpeed - speedLimit);

        boolean slowDown = currentSpeed > speedLimit;

        if(slowDown){
            System.out.println("You are driving " + overLimit + " mph over the limit. Slow down!");}

        input.close();
    }
}
/*
4. Create a class named SpeedCheck and write a program for the speed check.
	A variable named speedLimit is declared and given
	ask user to enter the current speed, if the current speed is over the speedLimit print slow down, otherwise do not print anything
        Ex:
            speedLimit = 55;

            Enter current speed:
            105

            output:
            	You're driving 50 mph over the limit. Slow down!

 */

