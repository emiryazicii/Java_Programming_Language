package lesson10_CustomMethods;

public class MethodOverloadingPractice {

    public static void main(String[] args) {

        System.out.println(sum(10,20));

        System.out.println(sum(10,20,30));

        System.out.println(sum(10,20,30,40));

        System.out.println(sum(1.5,2.5));

        System.out.println(sum(2.5,65.8,78.2));

        System.out.println(sum(2.5,5.6,8.9,1.2));
    }

    public static int sum(int a,int b){

        return a+b;
    }
    public static int sum(int a, int b, int c){

        return sum(a,b)+c;
    }
    public static int sum(int a, int b, int c ,int d){

        return sum(a,b,c)+d;
    }
    public static double sum(double num1,double num2){

        return num1 + num2;
    }

    public static double sum(double num1,double num2, double num3){

        return sum(num1,num2)+num3;

    }
    public static double sum(double num1,double num2,double num3, double num4){

        return sum(num1,num2,num3)+ num4;

    }
}
