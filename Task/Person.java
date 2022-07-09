package Task;

import java.util.Scanner;

public class Person {
	private String firstName;
	private String lastName;
	private String gender;
	private int salary=10000;
	void input() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your FirstName");
		String s = sc.next();
		setFirstName(s);
		System.out.println("Enter your LastName");
		String s1 = sc.next();
		setLastName(s1);
		System.out.println("Enter your Gender");
		String s3 = sc.next();
		setGender(s3);
	}
	void print() {
		System.out.println("FistName LastName Gender");
		System.out.println(getFirstName()+" "+getLastName()+" "+ getGender()+" "+salary);
	}
	public String getFirstName() {
		return firstName;	
	}
	public String getLastName() {
		return lastName;	
	}
	public String getGender() {
		return gender;	
	}
	public void  setFirstName(String fn) {
		firstName = fn;	
	}
	public void  setLastName(String ln) {
		lastName = ln;	
	}
	public void  setGender(String g) {
		gender = g;	
	}
public static void main(String[] args) {
	Person p1 = new Person();
	Person p2 = new Person();
	Person p3 = new Person();
	p1.input();
	p1.print();
	p2.input();
	p2.print();
	p3.input();
	p3.print();
}
}
