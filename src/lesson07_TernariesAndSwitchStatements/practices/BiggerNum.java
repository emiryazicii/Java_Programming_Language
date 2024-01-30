package lesson07_TernariesAndSwitchStatements.practices;

public class BiggerNum {

    public static void main(String[] args) {

        double n1 = 1_555.5 , n2 = -1_256 , n3 = 47_412;

        boolean n1Bigger = n1 > n2 && n1 > n3 ,
                n2Bigger = n2 > n1 && n2 > n3 ;

        String temp = (n1Bigger) ? (n1 + " is bigger") : (n2Bigger) ? (n2 + " is bigger") : (n3 + " is bigger") ;

        System.out.println(temp);
    }
}
/*
3. Create a class called BiggerNum, write a program that checks for the bigger of 3 numbers.

        you get 3 int variables with DIFFERENT values: n1 , n2 and n3

            if n1 is biggest output: "n1 is bigger"
            if n2 is biggest output: "n2 is bigger"
            if n3 is biggest output: "n3 is bigger"

         NOTE: MUST USE TERNARY
 */

