package lesson06_IfStatements.practices;

public class MedianNumber {

    public static void main(String[] args) {

        double a =45, b =-23, c =145;

        boolean aIsMedian = c > a && a > b || b > a && a > c || a == b && b != c || a == b && b == c,
                bIsMedian = a > b && b > c || c > b && b > a || b == c && a != c || b == c && a == c;

        String temp = "";

        if (aIsMedian) {
            temp = a + " is the median number.";
        }

        else if (bIsMedian) {
            temp = b + " is the median number";
        }

        else{
            temp = c + " is the median number";
        }
        System.out.println(temp);
    }
}
/*
Create a class named MedianNumber. write a program that can find the median number between three DIFFERENT given integers

		Ex:
                a = 10, b= 15, c = 20;

            Output:
                15 is the median number

 */
}
