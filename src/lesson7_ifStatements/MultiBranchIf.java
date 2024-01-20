package lesson7_ifStatements;

public class MultiBranchIf {

    public static void main(String[] args) {

        int num = 0;

        String temp = "";

        if (num > 0) {
            temp = "Positive";
        } else if (num < 0) {
            temp = "Negative";
        } else {
            temp = "Zero";
        }
        System.out.println(temp);
    }
}
/*
1. Create a class named PosNegZero.java
2. An integer variable named number is declared and given, Write a
program can identify if the number is positive, negative or zero

Ex:

number = 20

output:

Positive
 */