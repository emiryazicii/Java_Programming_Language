package lesson10_customMethods;

public class WarmUpTask {

    public static void main(String[] args) {

        calculate(200,5,'/');

        calculate(1,100,'-');
/*
        Scanner input = new Scanner(System.in);
        System.out.println("Enter two numbers and a math operator: ");
        double n1 = input.nextDouble(),
               n2 = input.nextDouble();

        char operator = input.next().charAt(0);

        calculate(n1,n2,operator);
*/
        System.out.println("----------------------------------------------");

        ageGroup(44);

        System.out.println("-----------------------------------------------");

        eligibleToVote(18,true);
    }

    public static void calculate(double num1, double num2, char mathOperator) {

        switch (mathOperator) {
            case '+':
                System.out.println(num1 + " " + mathOperator + " " + num2 + " = " + (num1 + num2));
                break;
            case '-':
                System.out.println(num1 + " " + mathOperator + " " + num2 + " = " + (num1 - num2));
                break;
            case '*':
                System.out.println(num1 + " " + mathOperator + " " + num2 + " = " + (num1 * num2));
                break;
            case '/':
                System.out.println(num1 + " " + mathOperator + " " + num2 + " = " + (num1 / num2));
                break;
            default:
                System.err.println("Invalid Operator");
        }
    }

    public static void ageGroup(int age){

        boolean validAge = age >= 0 && age <= 150;

        if (validAge){
            if (age <= 21){
                System.out.println("Teenager");
            } else if (age <55) {
                System.out.println("Adult");
            }else {
                System.out.println("Senior");
            }
        }else {

            System.err.println("Invalid Age"+age);
        }
    }

    public static void eligibleToVote(int age,boolean isAmerican){

        if (age >= 18 && isAmerican){
            System.out.println("Eligible to vote");

        }else {
            System.err.println("Not eligible to vote");
        }
    }
}

