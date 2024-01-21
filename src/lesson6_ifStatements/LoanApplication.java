package lesson6_ifStatements;

public class LoanApplication {


    public static void main(String[] args) {

        int salary = 44_000, creditScore = 750;

        String temp = "";

        if (salary >= 45_000 && creditScore >= 700) {
            temp = "Eligible";
        } else {
            temp = "Not eligible";
        }
        System.out.println(temp);
    }
}
/*
 1. Create a class named LoanApplication. two variables named salary and createdScore are declared and given, write a program that can check if the person is eligible to apply for a loan
            Note:In order to be eligible for a loan:
                    1. salary: at least 45K
                    2. credit score: at least 700


 */