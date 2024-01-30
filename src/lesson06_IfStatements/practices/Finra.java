package lesson06_IfStatements.practices;

public class Finra {

    public static void main(String[] args) {

        int number = 3;

        boolean selectedOptions = number % 3 == 0 || number % 5 == 0 || number % 15 == 0,
                by15 = number % 15 == 0, by5 = number % 5 == 0;

        String temp = "";

        if (!selectedOptions) {
            System.out.println(number);
        }
        else if (by15) {
            temp = "FINRA";
        }
        else if (by5) {
            temp = "RA";
        }
        else {
            temp = "FIN";
        }
        System.out.println(temp);

    }
}
/*
{IQ} Finra [multibranch, operators]

	Create a program that will print the given number. But if the number is a multiple of 3 print "FIN" instead of the number. If the number is a multiple of 5 print "RA" instead of the number. And if the number is a multiple of 3 and 5 print "FINRA" instead of the number

		ex:
			number: 3
			output: FIN

			number: 10
			output: RA

			number: 15
			output: FINRA

			number: 7
			output: 7

	Hint: you will be checking for divisibility, so you will need to use the % operator
 */

