package lesson14_CustomClass.practices;

public class Contact {

    public String name, email ;
    long phoneNumber;

    public void setInfo(String name, String email, long phoneNumber) {
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }
    public void call(){
        System.out.println("Calling "+name+" now...");
    }
    public void sendMessage(){
        System.out.println("Sending message to "+phoneNumber+" now...");
    }
    public void sendEmail(){
        System.out.println("Sending email to "+email+" now...");
    }

    public String toString() {
        return "Contact{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", phoneNumber=" + phoneNumber +
                '}';
    }
}
/*
 Create a custom class named Contact
		Attributes:
			name
			phoneNumber
			email

		Action:
			setInfo(): sets all the fields
			call(): displays the message "Calling $name now"
			sendMessage(): displays the message "sending message to $phoneNumber now"
			sendEmail(): displays the message "sending email to $email now"
 */

