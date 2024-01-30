package lesson06_IfStatements.practices;

public class Balance {

    public static void main(String[] args) {

        double amountBalance = 200,
                withdrawAmount = 250,
                remainingBalance = (amountBalance - withdrawAmount),
                overDraftFee = 100;

        boolean valid = amountBalance > 0 && withdrawAmount > 0,
                overDraftActive = remainingBalance < 0;

        String temp = "";

        if (!valid) {
            temp = "Invalid Entry";
        }
        else if (overDraftActive) {
            temp = "Remaining Balance : " + (remainingBalance - overDraftFee);
        }
        else {
            temp = "Remaining Balance : " + remainingBalance;
        }

        System.out.println(temp);
    }
}
/*
Balance [single if, operators, variables]

	Declare and assign the following variables
		amount balance & withdraw amount

    Check the balance after the withdrawal
        if you withdrew more money that you had in the account add a overdraft fee to the balance by subtracting 100

    In both cases print the remaining balance after withdrawing

 */

