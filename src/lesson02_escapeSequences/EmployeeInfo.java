package lesson02_escapeSequences;

public class EmployeeInfo {

    public static void main(String[] args) {

        System.out.println("Name: Emir Yazici");
        System.out.println("Gender: Male");
        System.out.println("Age: 33");
        System.out.println("Job Title: Java Developer");
        System.out.println("Company: UPMC");
        System.out.println("Salary: $134000");
        System.out.println();
        System.out.println("Name: Emir Yazici\nGender: Male\nAge: 33\nJob Title: Java Developer"+
                "\nCompany: UPMC\nSalary: $134000");
    }
}
// single line comment

/*
comment1
comment2
comment3

....


 */
/*
Create a Java file named "EmployeeInfo" and write a program that can display the following output on the console:

			output:
				Name: $yourName
				Gender: $gender
				Age: $age
				Job Title: Java Developer
				Company: $companyName
				Salary: $salary

			Note: Put your own info for name, gender etc
 */