package lesson07_TernariesAndSwitchStatements.practices;

public class SalesBonus {

    public static void main(String[] args) {

        int salesAmount = 46_000,
                bonus = 0;

        boolean bonus5K = (salesAmount >= 10_000 && salesAmount < 15_000),
                noBonus = (salesAmount < 10_000);

        String result = (noBonus) ? ("You have " + bonus + " bonus.")
                : (bonus5K) ? ("You have " + 5000 + " bonus.")
                : ("You have " + 7000 + " bonus.");

        System.out.println(result);

    }
}
/*
Sales Bonus [ternary]

	create a sales amount variable
	use the sales amount to determine the bonus you get at end of the month

		if your sales amount is less than 10000 you don't get any bonus

		if your sales amount is more than or equal to 10000 and less than 15000 you get a bonus of 5000

		if your sales amount is more than or equal to 15000 you get a bonus of 7000

		print your bonus number
 */

