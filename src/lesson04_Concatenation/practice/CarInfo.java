package lesson04_Concatenation.practice;

public class CarInfo {

    public static void main(String[] args) {

        int year = 2018,
                miles = 50_000,
                price = 19_000;

        String make = "Toyota",
                model = "Camry",
                color = "Red";

        System.out.println("\tCar information is :\n\t\t" + year + " " + make + " " + model + ", "
                + miles + " miles, " + color + ", $" + price + ".");
    }
}

/*
Create a class named CarInfo.java
   Declare the following variables:
      1. year
      2. make
      3. model
      4. miles
      5. color
      6. Price
   Use concatenation to print the full info of the car in the following format:

               Year Make Model, Miles, Color, Price.

Ex:
Car information is :
  2018 Toyota Camry, 50000 miles, Red, $19000.
 */

