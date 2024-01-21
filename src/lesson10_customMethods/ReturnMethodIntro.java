package lesson10_customMethods;

public class ReturnMethodIntro {

    public static void main(String[] args) {

        // int total = sum(20,40); // sum is a void method, does not return any data

        int total = addition(20,30);

        int t =square(5);

        System.out.println(t);

        System.out.println(cube(8));

        System.out.println(total);

    }

    public static void sum(int n1,int n2){

        int result = n1+n2;


    }

    public static int addition(int n1,int n2){

        int result = n1+n2;
        return result ;
    }

    public static int square(int num){

        int square = num*num;
        return square;


    }

    public static int cube(int num){

        int cube = square(num)*num;
        return cube;
    }
}
