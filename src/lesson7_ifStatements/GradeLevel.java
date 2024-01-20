package lesson7_ifStatements;

public class GradeLevel {

    public static void main(String[] args) {

        int gradeLevel = 11;

        String temp = "";

        if (gradeLevel <= 5) {
            temp = "Elementary School";
        } else if (gradeLevel <= 8) {
            temp = "Middle School";

        } else if (gradeLevel <= 12) {
            temp = "High School";

        } else if (gradeLevel <= 16) {
            temp = "College";

        } else {
            temp = "Grad School";
        }

        System.out.println(temp);
    }
}
