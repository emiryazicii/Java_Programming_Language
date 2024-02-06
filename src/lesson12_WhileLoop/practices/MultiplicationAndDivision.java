package lesson12_WhileLoop.practices;

public class MultiplicationAndDivision {

    public static void main(String[] args) {

        System.out.println(multiplication(10,50));
        System.out.println(division(2,5));
        System.out.println(division(100,25));
        System.out.println(division(12,0));
    }
    public static int multiplication(int num1, int num2) {

        int result = 0;

        for (int i = 1; i <= num2; i++) {

            result += num1;
        }
        return result;
    }
    public static int division(int num1, int num2) {

        int result = 0;

        if (num2 == 0){

            System.err.println("You can't divide any number by 0");
        }
        else if (num1 < num2){

            return 0;
        }
        while (num1 >= num2) {

            num1 -= num2;
            result++;
        }
        return result;
    }
}
