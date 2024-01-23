package lesson09_String;

public class StringMethods3 {

    public static void main(String[] args) {

        String sentence = "I love Python, Python is the best programming language, and Python is in high demand.";

        sentence = sentence.replace("Python", "Java");
        System.out.println(sentence);

        System.out.println("------------------------------------------------------------------------");

        String word = "java";

        // word = word.replace('a','e');

        word = word.replace("a", "e");
        System.out.println(word);

        System.out.println("--------------------------------------------------------------");

        String sentence2 = "I love Java, Java is cool";

        sentence2 = sentence2.replaceFirst("Java", "Python");
        System.out.println(sentence2);

        System.out.println("--------------------------------------------------------------");

        String sentence3 = "Java is fun, Java is cool, Java is amazing";

        sentence3 = sentence3.replaceFirst("Java is c", "Python is c");
        System.out.println(sentence3);

        System.out.println("-------------------------------------------------");

        String sentence4 = "I love Java Programming";

        String languageName = sentence4.substring(7, 10 + 1);
        System.out.println(languageName);

        System.out.println("-------------------------------------------");

        String sentence5 = "Today is Sunday, Tomorrow is Monday.";

        String day = sentence5.substring(9, 14 + 1);
        System.out.println(day);

        System.out.println("--------------------------------------------------");

        String email = "CydeoSchoolJavaProgramming@yahoo.com";

        int beginning = email.indexOf('@') + 1;
        int ending = email.lastIndexOf('.');
        String domain = email.substring(beginning,ending);
        System.out.println(domain);

        System.out.println("-------------------------------------------------------------");

        String sentence6 = "I love Java Programming";

        String r1 = sentence6.substring(7);
        System.out.println(r1);

        System.out.println("---------------------------------------------------");

        String sentence7 = "Today is Sunday, Tomorrow is Monday";

        int beginning2 = sentence7.lastIndexOf(" ") +1;
        String dayOfTomorrow = sentence7.substring(beginning2);
        System.out.println(dayOfTomorrow);

        System.out.println("----------------------------------------------------");

        String sentence8 = "I study at Cydeo School";
        int beginning3 = sentence8.indexOf('C');

        String schoolName = sentence8.substring(beginning3);
        System.out.println(schoolName);

        System.out.println("--------------------------------------------------------");

        String str5 = "Python";

        String result = (str5+" ").repeat(10);
        System.out.println(result);
    }
}
