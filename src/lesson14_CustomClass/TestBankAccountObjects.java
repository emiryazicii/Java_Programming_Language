package lesson14_CustomClass;

public class TestBankAccountObjects {

    public static void main(String[] args) {


        BankAccount bankAccount1 = new BankAccount();

        bankAccount1.setInfo("Emir Yazici",425612367);

        System.out.println(bankAccount1);
        bankAccount1.deposit(100);
        bankAccount1.withdraw(50);
        bankAccount1.checkBalance();


        System.out.println("-------------------------------");

        BankAccount bankAccount2 = new BankAccount();
        BankAccount bankAccount3 = new BankAccount();


        bankAccount2.setInfo("Sebastian",1234567891);

        bankAccount3.setInfo("Angel",785469321);

        bankAccount2.deposit(5000);
        bankAccount3.deposit(10000);

        bankAccount2.withdraw(2000);

        System.out.println(bankAccount1);
        System.out.println(bankAccount2);
        System.out.println(bankAccount3);
    }
}
