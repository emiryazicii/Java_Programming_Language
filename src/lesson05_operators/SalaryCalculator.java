package lesson05_operators;

public class SalaryCalculator {

    public static void main(String[] args) {

        double hourlyRate = 50 ,
                weeklyHours = 50 ,
                stateTaxRate = 0.07 ,
                federalTaxRate = 0.28 ,
                salaryBeforeTax = hourlyRate * weeklyHours * 52 ,
                stateTax = salaryBeforeTax * stateTaxRate ,
                federalTax = salaryBeforeTax * federalTaxRate ,
                totalTax = stateTax + federalTax ,
                salaryAfterTax = salaryBeforeTax - totalTax ;

        System.out.println("----------------------------------------");

        System.out.println("Gross pay is = $" + salaryBeforeTax);
        System.out.println("State Tax is = $" + stateTax);
        System.out.println("Federal Tax is = $" + federalTax);
        System.out.println("Total Tax is = $" + totalTax);
        System.out.println("Net income is = $" + salaryAfterTax);

        System.out.println("-----------------------------------------");

        System.out.println("Gross pay is = $" + salaryBeforeTax +
                "\nState Tax is = $" + stateTax +
                "\nFederal Tax is = $" + federalTax +
                "\nTotal Tax is = $" + totalTax +
                "\nNet income is = $" + salaryAfterTax);

        System.out.println("------------------------------------------");
    }
}
  /*
        1. Create a class called SalaryCalculator.java
			1.1declare the following variables:
					hourlyRate, weeklyHours, stateTaxRate, federalTaxRate

			1.2 use the given info in above variables to calculate the followings:
					1. salaryBeforeTax
					2. stateTax
					3. federalTax
					4. totalTax
					5. salaryAfterTax
				Hint: salaryBeforeTax = hourlyRate * weeklyHour * 52

			1.3 use print statement to print each of the above
					Ex:	   hourlyRate = $50
						   weeklyHours = 45
						   stateTaxRate = 6 (given as percentage, you need to convert to decimal)
						   federalTaxRate = 26 (given as percentage, you need to convert to decimal)
         */