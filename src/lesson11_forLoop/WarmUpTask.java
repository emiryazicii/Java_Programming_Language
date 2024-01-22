package lesson11_forLoop;

public class WarmUpTask {

    public static void main(String[] args) {


        System.out.println(sum2IntegerNumbers(12,20));
        System.out.println(sum3IntegerNumbers(30,45,75));
        System.out.println(sum4IntegerNumbers(12,56,89,78));

    }
    public static int sum2IntegerNumbers(int num1,int num2){

        return num1+num2;
    }
    public static int sum3IntegerNumbers(int num1,int num2,int num3){

        return sum2IntegerNumbers(num1,num2)+num3;
    }
    public static int sum4IntegerNumbers(int num1,int num2, int num3,int num4){

        return sum2IntegerNumbers(sum3IntegerNumbers(num1,num2,num3),num4);
    }
}
/*
Task 2:
	    1. create a method that can find the sum of two integer numbers
	                method name: sumOf2Numbers

	    2. create a method that can find the sum of three integer numbers
	                method name: sumOf3Numbers

	    3. create a method that can find the sum of four integer numbers
	                method name: sumOf4Numbers
 */