package lesson06_IfStatements.practices;

public class Calculator {

    public static void main(String[] args) {

        char mathOperator = '*';

        double n1 = 5, n2 = 8, multiplication = n1 * n2, addition = n1 + n2, subtraction = n1 - n2, division = n1 / n2;

        boolean validOperators = mathOperator == '+' || mathOperator == '-' || mathOperator == '*' || mathOperator == '/',
                invalidn2 = mathOperator == '/' && n2 == 0;

        String temp = "";

        if (!validOperators) {
            temp = "Invalid operator";

        } else if (invalidn2) {
            temp = "Invalid n2 entry, enter a number other than \"0\"";

        } else if (mathOperator == '+') {
            temp = "Result is : " + (addition);

        } else if (mathOperator == '-') {
            temp = "Result is : " + (subtraction);

        } else if (mathOperator == '*') {
            temp = "Result is : " + (multiplication);

        } else {
            temp = "Result is : " + (division);
        }
        System.out.println(temp);
    }
}
/*
3. Create a class called Calculator, Given two double variables named n1 & n2, and a char variable named mathOperator, write a program that can calculate result of n1&n2 based on the given math Operator.

		char operator -> -, +, *, /

		when operator is + : add num1, num2
		when operator: - : minus num1, num2
		when operator: * : multiply num1, num2
		when operator: / : divide num1, num2
		for any other operators: print "invalid operator"

		Ex:
			n1 = 10, n2= 20, mathOperator = '+'

		output:
			30

 */

