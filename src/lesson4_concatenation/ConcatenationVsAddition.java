package lesson4_concatenation;

public class ConcatenationVsAddition {

    public static void main(String[] args) {

        System.out.println("32" + 1); // "321"
        System.out.println(7 + "1"); // "71"
        System.out.println("13" + "2"); //132

        System.out.println("-----------------------------------");

        System.out.println(12 + 2.5);  // 14.5

        System.out.println("------------------------------------");

        System.out.println("The value is " + true);

    }
}
