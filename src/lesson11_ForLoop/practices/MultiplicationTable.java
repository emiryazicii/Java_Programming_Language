package lesson11_ForLoop.practices;

public class MultiplicationTable {

    public static void main(String[] args) {

        System.out.println(displayMultiplicationTable(5));
        System.out.println(displayMultiplicationTable(5,20));
    }
    public static String displayMultiplicationTable (int num){

        String temp = "";

        for (int i = 1; i <= 10  ; i++) {

            temp += num +" x "+ i +" = "+ (num*i) +"\n" ;
        }
        return temp;
    }
    public static String displayMultiplicationTable (int num, int multiplier){

        String temp = "";

        for (int i = 1; i <= multiplier ; i++) {

            temp += num +" x "+ i +" = "+ (num*i) +"\n" ;
        }
        return temp;
    }
}
/*
Multiplication Table [methods, loops, operators]

	create a method that will accept a number. Print the multiplication table for the give number up until 10

	print the results in this format:
		$number x 1 = result
		$number x 2 = result
		...
		$number x 10 = result

		ex:
			number = 4
			4 x 1 = 4
			4 x 2 = 8
			...

 */

