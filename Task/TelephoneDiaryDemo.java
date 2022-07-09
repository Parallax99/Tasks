package Task;

import java.util.ArrayList;
import java.util.Scanner;

public class TelephoneDiaryDemo{
public static void main(String[] args) {
	int count =0;
	byte choice ,flag=1;
	Scanner sc = new Scanner(System.in);
	while(flag!=0){
		System.out.println("======================================================");
		System.out.println("1)Add New Contact");
		System.out.println("2)Edit Contact");
		System.out.println("3)Search Contact");
		System.out.println("4)Delete Contact");
		System.out.println("5)Display");
		System.out.println("6)Exit from App");
		System.out.println("======================================================");
		System.out.println("Enter your Choice");
		choice = sc.nextByte();
		
		ArrayList<UserDetails> users =new ArrayList<>();
		switch(choice) {
		case 1: AddContact(users,count);
		break;
		case 2: EditContact(users);
		break;
		case 3: SearchContact(users);
		break;
		case 4: DeleteContact(users);
		break;
		case 5: Display(users);
		break;
		case 6: flag=0;
		default: System.out.println("Enter valid Choice");
		}
		}
}


private static void Display(ArrayList<UserDetails> users) {
	for(UserDetails user: users) {
		System.out.println(user);
	}
}

private static void DeleteContact(ArrayList<UserDetails> users) {
	
}

private static void SearchContact(ArrayList<UserDetails> users) {
	
}

private static void EditContact(ArrayList<UserDetails> users) {
	
}


private static void AddContact(ArrayList<UserDetails> users,int count) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter FirstName");
	String firstname= sc.next();
	System.out.println("Enter LastName");
	String lastname = sc.next();
	System.out.println("Enter ContactNo");
	String num1 = sc.next();
	while(true){
	UserDetails user = new UserDetails();
	user.setFirstName(firstname);
	user.setLastName(lastname);
	user.setContactNo(num1);
//	UserDetails user1 = new UserDetails(firstname, lastname, num1);
	users.add(user);
//	users.add(user1);
	count++;
	break;
	}
	System.out.println(users);
}}
class UserDetails{
	private String FirstName;
	private String LastName;
	private String ContactNo;
//	 UserDetails(String FirstName,String LastName,String ContactNo) {
//		 this.FirstName = FirstName;
//		 this.LastName = LastName;
//		 this.ContactNo = ContactNo;
	public String getFirstName() {
		return FirstName;
	}
	public void setFirstName(String firstName) {
		FirstName = firstName;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	public String getContactNo() {
		return ContactNo;
	}
	public void setContactNo(String contactNo) {
		ContactNo = contactNo;
	}
	 }

