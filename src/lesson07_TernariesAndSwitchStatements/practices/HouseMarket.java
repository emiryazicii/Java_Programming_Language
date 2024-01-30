package lesson07_TernariesAndSwitchStatements.practices;

public class HouseMarket {

    public static void main(String[] args) {

        String neighborhood = "HILLS";

        int averagePrice = 0;
        double rating = 0.0;

        boolean gated = true,
                allowPets = true;

        switch (neighborhood.toLowerCase()) {

            case "hills":
                averagePrice = 89_000;rating = 4.0;gated = false;allowPets = true;
                break;
            case "oaks":
                averagePrice = 75_000;rating = 3.5;gated = false;allowPets = true;
                break;
            case "highland":
                averagePrice = 150_000;rating = 4.5;gated = true;allowPets = false;
                break;
            case"canyon":
                averagePrice = 201_000;rating = 4.8 ;gated = true;allowPets = true;
                break;
        }

        String ifGated = (gated)? " is gated" : " is not gated";
        String ifPetAllowed = (allowPets)? "" : "not";

        String temp = "The houses in the " + neighborhood.toLowerCase() + " on average value at $" + averagePrice +
                ".This neighborhood" + ifGated + " and the rating of the school distracts near by is: " +
                rating + " out of 5.For the pet owners you are "+ifPetAllowed +" in luck because pets are "+ ifPetAllowed+" allowed.";

        System.out.println(temp);
    }
}
/*
T4HouseMarket [switch, variables]

You are buying a new house and need to collect information about the houses in a specific neighborhood

	create a program that will declare and define the neighborhood name and based on the name return a report of the houses in that area. The report should include this information: the average house price, rating of school districts near by(out of 5), if it is a gated community or not, and if pets are allowed

	print the final report in this format:
		$the houses in the $neighborhood_name on average value at $average_price. This neighborhood $is_gated_or_not and the rating of the school distracts near by is $school_rating out of 5. For the pet owners you $are_or_not in luck because pets are $allowed_or_not_allowed

		Note: for simple use you can print true or false in the gated and pets parts, but for a challenge try to print the message with as many dynamic parts as possible

	Data to use:

		name - Hills
		average price - 89,000
		rating - 4.0
		gated - no
		allow pets - yes

		name - Oaks
		average price - 75,000
		rating - 3.5
		gated - no
		allow pets - yes

		name - Highland
		average price - 150,000
		rating - 4.5
		gated - yes
		allow pets - no

		name - Canyon
		average price - 201,000
		rating - 4.8
		gated - yes
		allow pets - yes

 */

