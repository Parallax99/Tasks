package Task1to10.Task2;

import java.util.Random;
import java.util.Scanner;

public class StudentReg {
		static String Name;
		static String Email;
		static String Password;
		Random rd = new Random();
		int StudentId = rd.nextInt(10000);
		Scanner sc = new Scanner(System.in);
	void input(){
		
		System.out.println("Enter your Name");
		this.Name = sc.next();
		System.out.println("Enter your Email");
		this.Email = sc.next();
		System.out.println("Enter your Password");
		this.Password = sc.next();
	}
	void show(){
		System.out.println(StudentId+" "+Name+" "+Email+" "+Password);
		
	}
public static void main(String[] args) {
	StudentReg s1 = new StudentReg();
		s1.input();
		s1.show();
	}
} 
