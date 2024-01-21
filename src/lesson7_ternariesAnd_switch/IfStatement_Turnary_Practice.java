package lesson7_ternariesAnd_switch;

public class IfStatement_Turnary_Practice {

    public static void main(String[] args) {

        int score = 78;

        boolean valid = score >= 0 && score <= 100,
                gradeA = score >= 90, gradeB = score >= 80,
                gradeC = score >= 70, gradeD = score >= 60 ;

        String temp = "";

        if (!valid) {
            temp = "Invalid Score";
        } else {
            temp = (gradeA) ? "A" : (gradeB) ? "B"
                    : (gradeC) ? "C" : (gradeD) ? "D" : "F";
        }

        System.out.println(temp);

    }
}
