package lesson07_ternariesAnd_switch;

public class FieldTrip {

    public static void main(String[] args) {

        int gradeNumber = 3, numberOfGruops = 0;

        boolean grade1 = gradeNumber == 1, grade2 = gradeNumber == 2,
                grade3 = gradeNumber == 3, grade4 = gradeNumber == 4,
                grade5 = gradeNumber == 5, valid = gradeNumber >= 1 && gradeNumber <= 6;

        String location = "", teacher = "";

        if (!valid) {
            location = "Unknown";
            numberOfGruops = 0;
            teacher = "Unknown";
        } else if (grade1) {
            location = "Apple orchard";
            numberOfGruops = 3;
            teacher = "Ms. Smith";
        } else if (grade2) {
            location = "Zoo";
            numberOfGruops = 7;
            teacher = "Mr. Lee";
        } else if (grade3) {
            location = "Aquarium";
            numberOfGruops = 5;
            teacher = "Ms. Wilson";
        } else if (grade4) {
            location = "Movie theater";
            numberOfGruops = 2;
            teacher = "Ms. Reyes";
        } else if (grade5) {
            location = "Museum";
            numberOfGruops = 5;
            teacher = "Ms. Lela";
        } else {
            location = "Six Flags";
            numberOfGruops = 8;
            teacher = "Mr. Watt";
        }
        System.out.println("Location: " + location + "\nNumber of group is: " + numberOfGruops + "\nTeacher: " + teacher);
    }
}
/*
 2. Create a class called FieldTrip. Your school goes on a Field trip each year.The place you go will be based on your grade.
		Given a variable gradeNumber figure out the details of your field trip. Print the information at the end.
			    Data based on grade:
			        grade - 1
				        location -  Apple orchard
				        number of groups - 3
				        teacher in charge - Ms. Smith

			        grade - 2
				        location - Zoo
				        number of groups - 7
				        teacher in charge - Mr. Lee

			        grade - 3
				        location - Aquarium
				        number of groups - 5
				        teacher in charge - Ms. Wilson

			        grade - 4
				        location - Movie theater
				        number of groups - 2
				        teacher in charge - Ms. Reyes

			        grade - 5
				        location - Museum
				        number of groups - 5
				        teacher in charge - Ms. Lela

			        grade - 6
				        location - Six Flags
				        number of groups - 8
				        teacher in charge - Mr. Watt

			        for any other gradeNumber:
			        	location - Unknown
			        	numer of gourps - 0
			        	teacher in charge - Unknown

 */