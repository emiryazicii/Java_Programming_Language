package lesson10_string;

import java.util.Scanner;

public class StringIntro {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String str = " JAVA";

        System.out.println();

        String st1 = "Java";
        String st2 = "Java";

        System.out.println("--------------------------");

        String s1 = "Cat";
        String s2 = "Dog";

        String s3 = "Cat";
        String s4 = "Cat";

        System.out.println(s1 == s3);
        System.out.println(s1 == s4);
        System.out.println(s3 == s4);

        System.out.println("----------------------------------");

        String str1 = new String("Java"); // it creates 2 objects. 1. string pool 2. in the heap(outside string)
        String str2 = new String("Java");

        System.out.println(str1 == str2);

        System.out.println("-------------------------------------");

        String t1 = "Python";
        String t2 = new String("Python");
        String t3 = new String("Python");

        System.out.println(t1);
        System.out.println(t2);
        System.out.println(t3);

        System.out.println(t1 == t2);
        System.out.println(t2 == t3);

    }
}
