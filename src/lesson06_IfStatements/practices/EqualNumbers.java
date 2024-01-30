package lesson06_IfStatements.practices;

public class EqualNumbers {

    public static void main(String[] args) {

        double n1 = 1, n2 = 2, n3 = 3;

        boolean equal = n1 == n2 && n2 == n3,
                n1n2Equal = n1 == n2 && n2 != n3,
                n2n3Equal = n1 != n2 && n2 == n3,
                n1n3Equal = n2 != n3 && n1 == n3;

        String temp = "";

        if (equal) {
            temp = "all equal";
        } else if (n1n2Equal) {
            temp = "n1&n2 are equal";
        } else if (n2n3Equal) {
            temp = "n2&n3 are equal";
        } else if (n1n3Equal) {
            temp = "n3&n1 are equal";
        } else {
            temp = "none of them are equal";
        }

        System.out.println(temp);

    }
}
/*
5. Create a class named EqualNumbers, and write a program that can check the equality of the three given numberrs
	 			declare 3 numbers n1, n2, n3
	 			if all are equal ==> print "all equal"
	  			if only n1 and n2 are equal  =>print  "n1&n2 are equal"
	   			if only n2 and n3 are equal ==>print "n2&n3 are equal"
	   			if only n3 and n1 are equal ==>print "n3&n1 are equal"
				if none of them are eqUal ==> none of them are equal

 */

