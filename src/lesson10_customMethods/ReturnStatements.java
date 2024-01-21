package lesson10_customMethods;

public class ReturnStatements {

    public static void main(String[] args) {

        eligible(14);

        System.out.println(multiplication(5,7));

        System.out.println("-----------------------------------");

        System.out.println("Test 1 started");

        boolean exit = true;
        if (exit){
            return;

        }

        System.out.println("Test 1 completed");
        System.out.println("Test 2 started");
    }
    public static void eligible(int age){

        if (age < 0 || age >= 150){
            System.err.println("Invalid age: "+age);
            return; // exits the method
            // if the age invalid , then this method gets terminated.
        }

        if (age >= 21){
            System.out.println("You are eligible to buy alcohol");
        }else {
            System.out.println("You are not eligible to buy alcohol");
        }
    }

    public static int multiplication(int n1,int n2){

        return n1*n2; // returns the value when exiting the method

    }
}
