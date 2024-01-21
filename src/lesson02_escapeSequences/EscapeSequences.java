package lesson02_escapeSequences;

public class EscapeSequences {

    public static void main(String[] args) {

        System.out.println("Hello students\nToday we have java class ");
        System.out.println("...............................");
        System.out.println("\tJava Programming Language");
        System.out.println("\t\tJava Developer Course Batch 1");
        System.out.println("................................");
        System.out.println("\\");
        System.out.println(".................................");
        System.out.println("My favorite Tv show is \"Law and Order\"");
        System.out.println();
        System.out.println("Hello students.\nToday, we have java class.\n..............................."+
                "\n\tJava Programming Language\n\t\tJava Developer Course Batch 1\n"+
                "....................................\n\\\\\n......................................."+
                "\nMy favorite Tv Show is\"Law and Order\"");

        /*
        1. \n: New Line
        2. \t: Paragraph Space
        3. \\: Backslash
        4. \": Double Quote

         */
    }
}
