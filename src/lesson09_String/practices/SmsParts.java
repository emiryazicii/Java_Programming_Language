package lesson09_String.practices;

public class SmsParts {

    public static void main(String[] args) {

        String msg = "Sender: <Kamil Kamiloglu>. From Number: [724-123-8902]. Message: {Life is good}",
                fullName = msg.substring(msg.indexOf("<")+1,msg.indexOf(">")),
                firstName = fullName.substring(0,fullName.indexOf(" ")),
                lastName = fullName.substring(fullName.indexOf(" ")+1),
                message = msg.substring(msg.indexOf("{")+1,msg.indexOf("}")),
                areaCode = msg.substring(msg.indexOf("[")+1,msg.indexOf("-")),
                prefixNumber =msg.substring(msg.indexOf("-")+1,msg.lastIndexOf("-")),
                lineNumber = msg.substring(msg.lastIndexOf("-")+1,msg.indexOf("]"));

        System.out.println("Sender: "+firstName+" "+lastName+"\nNumber: "+areaCode+"-"+prefixNumber+"-"+lineNumber+"\nMessage: "+message);

    }
}


/*
SmsParts [substring, indexOf]

	Create a program that will has a message String in this exact format:

		Sender: <NAME>. From number: [NUMBER]. Message: {MESSAGE}

	The content of name, number and message can vary, so based on the format extract those parts and output them.

	Ex:
	Sender: <Omer Karahan>. From Number: [202-123-3456]. Message: {I love programming and problem solving}

	Output:
		Sender: Omer Karahan
		Number: 202-123-3456
		Message: I love programming and problem solving

 */

