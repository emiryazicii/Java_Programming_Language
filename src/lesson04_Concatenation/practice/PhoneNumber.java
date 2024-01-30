package lesson04_Concatenation.practice;

public class PhoneNumber {

    public static void main(String[] args) {

        int countryCode = 1,
                areaCode = 703,
                localNumber = 4512625;

        System.out.println("Phone Number Is : +" + countryCode + "(" + areaCode + ")-" + localNumber);
    }
}
/*
create a class named PhoneNumber and declare the following variables:
            countryCode, areaCode, localNumber

            use string concatenation to display the phone number

            ex:
                if  countryCode = 1
                    areaCode = 703
                    localNumber = 4512625

                output:
                    +1(703)-4512625

 */

