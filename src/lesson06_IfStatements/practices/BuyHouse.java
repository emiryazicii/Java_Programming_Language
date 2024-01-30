package lesson06_IfStatements.practices;

public class BuyHouse {

    public static void main(String[] args) {

        int salary = 80_000,
                creditScore = 740;

        boolean eligible = creditScore >= 720 && salary >= 100_000 || creditScore >= 740 && salary >= 80_000;

        String temp = "";

        if (eligible) {
            temp = "Start packing because you are eligible for this loan!";
        } else {
            temp = "Sorry we cannot offer a loan to you at this time";
        }
        System.out.println(temp);

    }
}
/*
T3BuyHouse [variables, if statement, operators]

    Create a program that will define two variables: credit score and salary
    Use the given information to determine if you are eligible for a loan to buy a new house
    here are the criteria for eligibility:
        credit score of 720 or above and salary of 100,000 or above
        credit score of 740 or above and salary of 80,000 or above

    Output:
        if you are eligible because you meet one of the above conditions:
            Start packing because you are eligible for this loan!
        if you are not eligible:
            Sorry we cannot offer a loan to you at this time
 */

