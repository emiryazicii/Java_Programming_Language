package lesson07_TernariesAndSwitchStatements.practices;

public class Language {

    public static void main(String[] args) {

        String language = "Turkish",
                temp = "";

        switch (language) {
            case "English":
                temp = "Hello , thanks for your call";
                break;
            case "Spanish":
                temp = "Hola , gracias para llamar";
                break;
            case "Turkish":
                temp = "Merhaba , aradiginiz icin tesekkurler.";
                break;
            case "Russian":
                temp = "Privet , spasibo za vash zvonok";
                break;
            case "French":
                temp = "Merci, pour votre appel";
                break;
            default:
                temp = "Sorry, " + language + " not supported";
        }
        System.out.println(temp);
    }
}
/*
Language [switch]

	Declare and assign a language variable
	Based on the language selected print the related message:

	English: hello, thank for your call
	Spanish: hola, gracias para llamar
	Turkish: merhaba, aradiginiz icin tesekkurler
	Russian: privet, spasibo za vash zvonok
	French: Merci, pour votre appel
	Any other input: sorry, $given_language not supported

 */

