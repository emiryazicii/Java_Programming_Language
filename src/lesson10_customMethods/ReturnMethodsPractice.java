package lesson10_customMethods;

public class ReturnMethodsPractice {


    public static void main(String[] args) {

        System.out.println(displayIfOdd(100));
        System.out.println(displayIfEven(100));

        int num = 200;

        if (displayIfEven(num)){
            System.out.println(num+" is even number");
        }else {
            System.out.println(num+" is odd number");
        }

        System.out.println("--------------------------------------------");

    }

    public static boolean displayIfOdd(int num){

        return (num % 2 !=0) ;
    }

    public static boolean displayIfEven(int num){

        return !displayIfOdd(num);
    }

    public static int displayMaxNumber(int num1, int num2){

        return (num1 > num2 )? num1 : num2;
    }
}
