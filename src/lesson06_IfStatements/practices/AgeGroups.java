package lesson06_IfStatements.practices;

public class AgeGroups {

    public static void main(String[] args) {

        int age = 93;
        boolean validAge = age > 0 && age < 150,
                ageTo21 = age < 21 , ageTo55 = age < 55 && age >=21;

        String temp = "";

        if (!validAge) {
            temp = " Invalid age.";
        } else if (ageTo21) {
            temp = "Teenager";
        } else if (ageTo55) {
            temp = "Adult";
        } else {
            temp = "Senior";
        }

        System.out.println(temp);
    }
}
/*
3. Create a class called AgeGroups, write a program that can define the age groups of a person
            age groups are:
                    Teenager (< 21)
                    Adult   (>=21 && <55 )
                    Senior  ( > 55 )

             if age is negative or greater than 150, print invalid

             NOTE: MUST USE NESTED IF. DO NOT USE MORE THAN ONE PRINT STATEMENT

 */

