package lesson09_String.practices;

import java.util.Scanner;

public class URL {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter an URL: ");
        String url = input.next().toLowerCase();
        input.close();

        boolean validBeginning = url.startsWith("www."),
                validEnd =url.endsWith(".com")||url.endsWith(".org")||url.endsWith(".edu")||url.endsWith(".gov");

        String temp ,
                b = "www.",
                e = ".com, .org, .edu, .gov";

        if(validBeginning&&validEnd){
            String domain= url.substring(url.indexOf(".")+1,url.lastIndexOf("."));
            temp = url+" is a valid URL for "+domain;
        }else if(!validBeginning&&validEnd){
            temp ="Sorry, "+url+ " is not valid because it is missing these: "+b+ " in the beginning";
        }else if(validBeginning){
            temp ="Sorry, "+url+ " is not valid because it is missing these: "+e+ " at the end";
        }else {
            temp ="Sorry, "+url+ " is not valid because it is missing these: "+b+ " in the beginning and "+e+ " at the end";
        }
        System.out.println(temp);
    }
}


/*
Url [Scanner, String methods, conditional]

	Create a program that will allow the user to enter a url. The program will verify if the given url is valid and if it is print the domain name

	A url is valid if it has "www." in the beginning and has either .com, .org, .edu. or .gov at the end

	If the url is valid print the domain name part: $url is a valid url for google

		ex: www.google.com
			www.google.com is a valid url for google

	If the url is not valid print the reason it is not valid:

		ex: amazon.com
		Sorry, amazon.com is not valid because it is missing these:
			www. in the beginning

		ex: youtube
		Sorry, youtube is not valid because it is missing these:
			www. in the beginning
			.com, .org, .edu, or .gov in the end

 */

