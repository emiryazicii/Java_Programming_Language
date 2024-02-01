package lesson10_CustomMethods.practices;

public class CurrencyConverter {

    public static void main(String[] args) {

        System.out.println(convertToDollar("Euro", 100));
        System.out.println(convertToDollar("yEn", 50));
        System.out.println(convertToDollar("LirA", 20));
        System.out.println(convertToDollar("WOn", 100));
        System.out.println(convertToDollar("ruPEE", 1000));
    }
    public static double convertToDollar(String currencyType, double currencyAmount) {

        double result = currencyAmount * 1;

        switch (currencyType.toLowerCase()) {
            case "euro":
                result *= 0.91;
                break;
            case "yen":
                result *= 123.03;
                break;
            case "lira":
                result *= 14.85;
                break;
            case "won":
                result *= 1217.45;
                break;
            case "rupee":
                result *= 181.45;
                break;
        }
        return result;
    }
}
/*
Currency Converter [methods, conditional, operators]

	create a method that will accept a currency type(String) and a currency amount (double)[as dollars] and convert the currency from dollars to a different type. return the converted number

	Use the following sample rates for currency conversions
		1 dollar = 0.91 euro
		1 dollar = 121.03 yen
		1 dollar = 14.85 lira
		1 dollar = 1,217.52 won
		1 dollar = 181.45 rupee

	Note: Don't worry about decimal formats, focus on the code to create these conversions

	Follow up: think about how this method could be improved

		Ex:
			Input: euro, 100
			Output: 91

		Ex:
			Input: yen, 50
			Output: 6051.5
 */

