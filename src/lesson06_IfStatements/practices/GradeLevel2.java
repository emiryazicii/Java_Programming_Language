package lesson06_IfStatements.practices;

public class GradeLevel2 {

    public static void main(String[] args) {

        int gradeLevel = 18;

        boolean valid = gradeLevel >= 1 && gradeLevel <= 18,
                grade1To5 = gradeLevel <= 5, grade6To8 = gradeLevel <= 8,
                grade9To12 = gradeLevel <= 12, grade13To16 = gradeLevel <= 16;

        String temp = "";

        if (!valid) {
            temp = "Invalid Entry";
        } else if (grade1To5) {
            temp = "Elementary School";
        } else if (grade6To8) {
            temp = "Middle School";
        } else if (grade9To12) {
            temp = "High School";
        } else if (grade13To16) {
            temp = "College";
        } else {
            temp = "Grad School";
        }

        System.out.println(temp);
    }
}
