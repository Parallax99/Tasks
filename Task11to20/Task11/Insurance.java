package Task11to20.Task11;

import java.util.Scanner;

public class Insurance {
	private static String excellent;
	private static String poor;	
	String health;
	String gender;
	int age;
	
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter appropriate choices");
	System.out.println("Select your current health Condition");
	System.out.println("1)Excellent");
	System.out.println("2)Poor");
	int key = sc.nextInt();
	System.out.println("Enter your current Age");
	int age = sc.nextInt();
	System.out.println("Enter your City");
	String C = sc.next();
//	System.out.println(C);
	System.out.println("Enter Gender");
	String G = sc.next();
	switch(key) {
	case 1:String H = excellent;
	if( age>=25&&age<=35) {
		if((C.equals("city")&&G.equals("male"))==true){
			System.out.println("You will get insurance of 4 Thousand Rupees");
		}else {
			System.out.println("You are not insured");
		}
		}else {			System.out.println("You are not insured");
}
		break;
	case 2:String H1 = poor; 
	if( age>=25&&age<=35) {
		if((C.equals("village")&&G.equals("male"))==true){
			System.out.println("You will get insurance of 4 Thousand Rupees");
		}else {
			System.out.println("You are not insured");
		}
		}else {System.out.println("You are not insured");
}

	break;
	default: System.out.println("Enter valid choice");
		
	}
	}
}

	

