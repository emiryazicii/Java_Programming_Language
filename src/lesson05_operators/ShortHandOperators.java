package lesson05_operators;

public class ShortHandOperators {

    public static void main(String[] args) {

        int a = 20 ;

        System.out.println(a); //20

        System.out.println(a);  // 20

        a = 40 ;

        System.out.println(a);  // 40

        a = 90 ;

        System.out.println(a);

        System.out.println("--------------------------------------------------------");

        double balance = 100;

        balance += 1000; // balance = 100 + 1000

        System.out.println("Balance is = " + balance);

        balance += 500; // balance = 1100 +500

        System.out.println("Balance is = " + balance);

        balance += 10_000; // balance = 1600 + 10000

        System.out.println("Balance is =" + balance);

        balance -= 1000; // balance = 11600- 1000

        System.out.println("Balance is = " + balance);

        balance -= 5000; // balance = 10600- 5000

        System.out.println("Balance is = " + balance);

        System.out.println("---------------------------------------------------------------");

        double salary = 45000;

        salary *= 2; // salary = 45000 * 2

        System.out.println("Salary is = " + salary);

        salary *= 3 ;

        System.out.println("Salary is = " + salary);

        System.out.println("-----------------------------------------------------------------");

        double eth = 4 ;

        eth *= 250 ;

        System.out.println("Eth price is = " + eth);

        eth /= 2 ;

        System.out.println("Eth price is = " + eth);

        salary /= 2;

        System.out.println("Salary is = " + salary);

        int b = 39 ;

        b %= 7 ; // b = 39 % 7 = 4

        System.out.println(b);
    }
}
