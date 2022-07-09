package Task;

import java.util.Scanner;

public class Student {
	int StudentId;
	String name;
	String Email;
	String Password;
	Student(){
		StudentId = (int) (Math.random()*100000);
	}
	void input() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name Email and Password");
		name = sc.next();
		Email= sc.next();
		Password = sc.next();
	}
	void print() {
		System.out.println(StudentId+"\t"+name+"\t"+Email+"\t"+Password);
	}
 public static void main(String[] args) {
	Student s1 = new Student();
	s1.input();
	s1.print();
}
 }

