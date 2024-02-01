package lesson10_CustomMethods.practices;

public class FullName {

    public static void main(String[] args) {

        displayFullName("thomas","anderson");
        displayFullName("arnold","schwarzenegger");
        displayFullName("kemal","ataturk");
        displayFullName("tarik","menguc");

    }
    public static void displayFullName(String firstname, String lastname){

        firstname = firstname.substring(0,1).toUpperCase() + firstname.substring(1);
        lastname  = lastname.substring(0,1).toUpperCase() + lastname.substring(1);
        String fullName = firstname + " " + lastname;

        System.out.println(fullName);
    }
}
/*
Create a method named capitalization that can format the first and last names of the person and display the full name of the person
    Ex:
        capitalization("cyDeO", "sCHooL")

        output:
            full name: Cydeo School
 */

