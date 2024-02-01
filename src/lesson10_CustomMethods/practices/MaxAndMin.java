package lesson10_CustomMethods.practices;

public class MaxAndMin {

    public static void main(String[] args) {

        System.out.println(max(452.31, 562.87));
        System.out.println(min(123.895,785.145));
        System.out.println(max(5,5));
    }
    public static double max(double num1, double num2) {

        return (num1 > num2) ? num1 : num2;
    }
    public static double min(double num1,double num2){

        return (num1 < num2)? num1 : num2;
    }
}
/*
3. Create a method named max, that can return the maximum number between two numbers

4. Create a method named min, that can return the minimum number between two numbers
 */

