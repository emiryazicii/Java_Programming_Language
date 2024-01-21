package lesson9_string;

import java.io.IOException;
import java.nio.file.Path;
import java.util.Scanner;

public class ReadFileWithScanner {

    public static void main(String[] args) throws IOException {


        Scanner scan = new Scanner(Path.of("src/lesson10_string/Test.txt"));
/*
        System.out.println(scan.nextLine());
        System.out.println(scan.nextLine());
        System.out.println(scan.nextLine());
*/

/*
        System.out.println(scan.next());
        System.out.println(scan.next());
        System.out.println(scan.next());
        System.out.println(scan.next());
        System.out.println(scan.next());
        System.out.println(scan.next());
        System.out.println(scan.next());
*/

        // System.out.println(scan.hasNext());

        scan.close();

    }
}
