package lesson10_CustomMethods.practices;

public class EmailDomain {


    public static void main(String[] args) {

        displayDomain("nabukadnezar-2055@yahoo.com");
        displayDomain("neseli_gunler3245@hotmail.com");
        displayDomain("the_last-samurai@gmail.com");
        displayDomain("hakunamatata009@outlook.com");
    }
    public static void displayDomain(String email){


        String domain = email.substring(email.indexOf("@")+1,email.indexOf(".com"));

        System.out.println(domain);

    }
}
/*
Create a method named emailDomain that can display the domain of the email
    Ex:
        emailDomain("Cydeo@gmail.com")

        output:
            domain: gmail
 */

