package lesson06_IfStatements.practices;

public class PandemicChecker {

    public static void main(String[] args) {

        int year = 1962;

        boolean validYear = (year > 0 && year < 2023),
                theBlackDeath = (year >= 1346 && year <= 1353),
                greatPlagueOfLondon = (year == 1665 || year == 1666),
                russianPlague = (year >= 1770 && year <= 1772),
                fluPandemic = (year == 1889 || year == 1890),
                americanPolioEpidemic = (year == 1916),
                spanishFlu = (year >= 1918 && year <= 1920),
                h1n2SwineFlu = (year == 2009 || year == 2010),
                westAfricanEbola = (year >= 2014 && year <= 2016),
                covid19 = (year == 2020 || year == 2021);

        boolean noPandemic = (!theBlackDeath && !greatPlagueOfLondon &&
                              !russianPlague && !fluPandemic &&
                              !americanPolioEpidemic && !spanishFlu &&
                              !h1n2SwineFlu && !westAfricanEbola && !covid19);

        String temp = "";

        if (!validYear) {
            temp = "Sorry " + year + " is not a valid year.";
        } else if (noPandemic) {
            temp = "No Pandemic in " + year;
        } else if (theBlackDeath) {
            temp = "The Black Death";
        } else if (greatPlagueOfLondon) {
            temp = "Great Plague Of London";
        } else if (russianPlague) {
            temp = "Russian Plague";
        } else if (fluPandemic) {
            temp = "Flu Pandemic";
        } else if (americanPolioEpidemic) {
            temp = "American Polo Epidemic";
        } else if (spanishFlu) {
            temp = "Spanish Flu";
        } else if (h1n2SwineFlu) {
            temp = "H1N2 Swine Flu";
        } else if (westAfricanEbola) {
            temp = "West African Ebola";
        } else {
            temp = "Covid 19";
        }
        System.out.println(temp);

    }
}

/*
T6Pandemic Checker [nested if, multibranch, operators]

	Create a program that will define a year. Determine if there was a pandemic in that year. Before checking for pandemics also verify the given year is a valid year value.
		a valid year is a year in the range of: 0 > year < 2023
			-> if the given year is not valid do not check anything else and print:
					sorry $given_year is not a valid year

		if a valid year is given check the ranges and output the pandemic if there was any

	Use this data for years that had a pandemic:
        1346-1353: The Black Death
        1665-1666: Great Plague of London
        1770-1772: Russian plague
        1889-1890: Flu pandemic
        1916: American polio epidemic
        1918-1920: Spanish Flu
        2009-2010: H1N1 Swine Flu pandemic
        2014-2016: West African Ebola epidemic
        2020-2021: COVID-19
        Any year not in those ranges: No Pandemic in $given_year

 */

