package lesson06_IfStatements.practices;

public class GradeReport {

    public static void main(String[] args) {

        int score = 1;

        boolean valid = score >= 0 && score <= 100,
                scoreTo100 = score >= 90, scoreTo90 = score >= 80,
                scoreTo80 = score >= 70,scoreTo70 =  score >= 60 ;

        String temp = "";

        if (!valid) {
            temp = "Invalid Entry";
        } else if (scoreTo100) {
            temp = "Your grade is A";
        } else if (scoreTo90) {
            temp = "Your grade is B";
        } else if (scoreTo80) {
            temp = "Your grade is C";
        } else if (scoreTo70) {
            temp = "Your grade is D";
        } else {
            temp += "Your grade is F";
        }

        System.out.println(temp);
    }
}
