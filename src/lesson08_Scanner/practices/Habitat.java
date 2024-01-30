package lesson08_Scanner.practices;

import java.util.Scanner;

public class Habitat {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the habitat type so I can tell you what kind of animals live there:");
        String habitat = input.next();

        input.close();
        String temp = "",
                animals ;
        switch (habitat.toLowerCase()){
            case"grassland":
                animals = " goats, bison, badgers, and coyotes";
                temp ="In the vast " +habitat.toLowerCase()+ " of North America,"+ animals +" coexist," +
                        " each playing a unique role in the delicate balance of this rich and diverse ecosystem.";
                break;
            case"jungle":
                animals = " snakes, tigers, gorillas, rhinos, and toucans";
                temp ="Within the lush " +habitat.toLowerCase()+", thrive,"+animals+
                        " showcasing the incredible biodiversity of this vibrant habitat.";
                break;
            case"city":
                animals = " dogs, cats, gulls, and squirrels";
                temp ="Amid the bustling " +habitat.toLowerCase()+","+animals+" have adapted to urban life," +
                        " forming a diverse community of animals that share the concrete jungle with their human counterparts.";
                break;
            case"safari":
                animals = " lions, hippos, giraffes, zebras, and elephants";
                temp ="In the vast and awe-inspiring "+habitat.toLowerCase()+","+animals+" roam freely," +
                        " creating a majestic tapestry of African wildlife.";
                break;
            default:
                temp = "Invalid habitat.No information available.";
        }
        System.out.println(temp);
    }
}
/*
T3Habitat [switch, variables, Scanner]

	create a program that will ask the user about a habitat and print the information about the animals that can be found in that habitat

	use the following data and make creative messages for the outputs
		habitat - animals
		grasslands - goats, bison, badgers, coyotes
		jungle	- snakes, tigers, gorillas, rhinos, toucans
		city	- dogs, cats, gulls, squirrels
		safari - lion, hippo, giraffe, zebras, elephants

		anything else - invalid habitat. no information available

		Ex:
			input:
				jungle
			output:
				In the jungle you will be able to find: snakes, tigers, gorillas, rhinos, toucans
 */

