package lesson07_TernariesAndSwitchStatements.practices;

public class Loan {

    public static void main(String[] args) {

        int salary = 74_000, creditScore = 712;

        boolean approved = salary > 60_000 && creditScore >650 ;

        String temp = (approved) ? "Loan Approved" : "Denied" ;

        System.out.println(temp);

    }
}
/*
Create a class called Loans, Given two variables salary and credit score, use those given info to determine if you can get a loan.

                To be approve for the loan, print: "Loan Approved":
                        Salary: above 60,000
                        Credit Score: above 650

                    Otherwise print: "Loan Denied"

              NOTE: MUST USE TERNARY.
 */

