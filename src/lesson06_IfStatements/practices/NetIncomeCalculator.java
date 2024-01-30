package lesson06_IfStatements.practices;

public class NetIncomeCalculator {

    public static void main(String[] args) {

        double salaryBeforeTax = 200_000,
                taxRate = 0,
                marriageDiscount = 0.05;

        boolean married = true,
                loverThan80K = salaryBeforeTax <= 79_000,
                loverThan100K = salaryBeforeTax >= 80_000 && salaryBeforeTax <= 99_000,
                loverThan130K = salaryBeforeTax >= 100_000 && salaryBeforeTax <= 129_000;

        if (loverThan80K) {
            taxRate = 0.2 ;
        } else if (loverThan100K) {
            taxRate = 0.25 ;
        } else if (loverThan130K) {
            taxRate = 0.3 ;
        } else {
            taxRate = 0.35;
        }

        if (married) taxRate -= marriageDiscount;

        double  totalTax = salaryBeforeTax * taxRate,
                netIncome = salaryBeforeTax - (totalTax);

        System.out.println("Net income is = " + netIncome);
    }
}
/*
Create a class named NetIncomeCalc, Write a program that can calculate the salary after tax based on the following requirements
                the tax rates are:
                        35% for salary of 130K or more
                        30% for salary of 100K to 129k
                        25% for salary of 80K to 99K
                        20% for salary of 79K or less

                in addition, if the person is married, he/she will pay 5% less tax
 */

