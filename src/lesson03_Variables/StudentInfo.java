package lesson03_Variables;

public class StudentInfo {

    public static void main(String[] args) {

        // DataType variableName = Data;
/*
        String student_name ="Karla",
               school_name = "Carlow University",
               grade_level = "Mid Level JD";
        int num1 = 100, num2 = 200, num3 = 300;
*/
        String student_name ="Nora",
                school_name ="MIT",
                grade_level ="Undergraduate",
                student_id ="C25";

        int age = 26;
        char gender ='F';
        double gpa = 3.8;
        boolean isFullTime = true;

        System.out.println("student_name = " + student_name);
        System.out.println("age = " + age);
        System.out.println("gender = " + gender);
        System.out.println("school_name = " + school_name);
        System.out.println("grade_level = " + grade_level);
        System.out.println("student_id = " + student_id);
        System.out.println("gpa = " + gpa);
        System.out.println("isFullTime = " + isFullTime);
    }
}
/*
Create a class named StudentInfo.java
Declare the following variables with appropriate data types:
1. students_name
2. age
3. gender
4. school_name
5. student_id
6. grade_level
7. gpa
 */