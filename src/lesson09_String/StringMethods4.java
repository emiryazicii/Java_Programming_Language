package lesson09_String;

public class StringMethods4 {

    public static void main(String[] args) {

        String word = "Java";

        boolean r1 = word.isEmpty();
        System.out.println(r1);

        System.out.println("----------------------------------------------");

        String str = "          ";

        boolean r2 = str.isBlank();
        System.out.println(r2);

        System.out.println("-----------------------------------------------");

        String str1 = "Cydeo";

        String str2 = new String("Cydeo");
        System.out.println(str1.equals(str2));

        String str3 = new String("cydeo");
        System.out.println(str2.equalsIgnoreCase(str3));

        System.out.println("-----------------------------------------------");

        String s1 = "JAVA";
        String s2 = "java";

        System.out.println(s1.equalsIgnoreCase(s2));

        System.out.println("---------------------------------------------------");

        String sentence = "Hasan Naran Sumeye Nataliia";

        boolean Ahmad = sentence.contains("Ahmad");
        System.out.println(Ahmad);

        String sentence2 = "My favorite programming language is JAVA";

        boolean hasJava = sentence2.toLowerCase().contains("java");
        System.out.println(hasJava);

        System.out.println("----------------------------------------------------");

        String sentence3 = "Cybertek School is the best";

        boolean Cybertek = sentence3.startsWith("Cybertek");
        System.out.println(Cybertek);

        String name = "Michael";

        boolean l = name.startsWith("Da");
        System.out.println(l);

        String url = "www.cydeo.com";

        boolean isValid = url.startsWith("www.");
        System.out.println(isValid);

        boolean t = url.endsWith(".com");
        System.out.println(t);

        System.out.println("-------------------------------------------------------------");

        String email = "CydeoSchool@gmail.com";

        boolean gmail = email.endsWith("gmail.com");
        System.out.println(gmail);

        boolean yahoo = email.endsWith("yahoo.com");
        System.out.println(yahoo);

        boolean hotmail = email.endsWith("hotmail.com");
        System.out.println(hotmail);
    }
}
