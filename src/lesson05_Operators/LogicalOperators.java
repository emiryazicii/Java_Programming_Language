package lesson05_Operators;

public class LogicalOperators {

    public static void main(String[] args) {

        // && :

        double salary = 60000;
        int creditScore = 650;
        int age = 42;

        boolean eligibleForLoan = salary>=30000 && creditScore>=650 && age>=18;
        //                             true   &&       true       &&    true
        System.out.println(eligibleForLoan);

        System.out.println("----------------------------------------------------------");

        age = 18;

        String countryOfThePerson = "USA" ;

        boolean eligibleToVote = age>=18 && countryOfThePerson=="USA" ;
        //                            true  &&   true
        System.out.println(eligibleToVote);

        System.out.println("----------------------------------------------------------");

        // || :

        String answer = "maybe" ;

        boolean validAnswer = answer == "yes" || answer == "no" ;

        System.out.println(validAnswer);

        System.out.println("----------------------------------------------------------");

        char grade = 'B';

        boolean passedTheExam = grade == 'A' || grade == 'B'|| grade== 'C'|| grade == 'D';

        System.out.println(passedTheExam);

        System.out.println("----------------------------------------------------------");

        // ! :

        System.out.println(!true);

        String a = "yes";

        boolean yes = a == "yes" ;

        boolean no  = !yes ;

        System.out.println("Yes = " + yes);

        System.out.println("No = " + no );

        System.out.println("----------------------------------------------------------");

        int score = 65 ;

        boolean passed = score>=60 ;

        boolean failed = !passed ;

        System.out.println(passed);

        System.out.println(failed);

        System.out.println("----------------------------------------------------------");

        System.out.println(  true == !false && false == !true && true != !true);
        //                         true     &&       true      &&      true
    }
}
