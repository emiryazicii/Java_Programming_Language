package lesson04_Concatenation.practice;

public class SalaryCalculator {

    public static void main(String[] args) {

        String name = "Joshua";

        double hourlyRate = 40,
                weeklyHours = 45,
                salary = hourlyRate * weeklyHours * 52 ;

        System.out.println("\tHello " + name + ", your salary is $ " + salary);

    }
}
/*
Create a class named SalaryCalculator.java
   Declare the following Variables:

1. name
2. hourlyRate
3. weeklyHours

   Write a program that can calculate the salary, and display the following info:

   Hint: there are 52 weeks in a year

   salary = hourlyRate * weeklyHours * 52

Ex:
given data:

name = “Joshua”
hourlyRate = 40
weeklyHours = 45

output:
Hello Joshua, your salary is $ 93600
 */

