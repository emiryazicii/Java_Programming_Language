package lesson08_Scanner.practices;

import java.util.Scanner;

public class HowManyPeople {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("How many people are you living with ?");

        int answer = input.nextInt();

        boolean lessThan3 = answer < 3 ,
                liveWith3To6 = answer >= 3 && answer <= 6;

        String result = (lessThan3) ? "You are living with less than 3 people." :
                        (liveWith3To6) ? "You are living with 3 - 6 people." : "You are living with more than 6 people.";

        System.out.println(result);

        input.close();
    }
}
/*
 Ask the user how many people they live with:
            if user lives with Less than 3 people: print "Live with less than 3 people"
            if the user lives with 3 - 6 people: print "Live with 3 - 6 people"
            if the user lives with more than 6 people: print "Live with "more than 6 people"
 */

