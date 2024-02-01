package lesson11_ForLoop.practices;

public class Factorial {

    public static void main(String[] args) {

        System.out.println(factorial(5));
        System.out.println(factorial(10));
        System.out.println(factorial(3));
    }
    public static int factorial(int num){

        int factorial = 1;

        for (int i = num; i >=1 ; i--) {

            factorial *= i;
        }
        return factorial;
    }
}
/*
4. Write a program that can return the factorial number of any given number
           Ex:
                input: 5
                output: 120
                	( because: 5! = 5 * 4 * 3 * 2* 1 = 120 )
 */

