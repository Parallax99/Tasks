package Task;

import java.util.Scanner;

public class Admission {
	String firstName;
	String lastName;
	int mobileNo;
	public void eligible(String s,int mnum,int pnum,int cnum) {
		int total = mnum+pnum+cnum;
		int total1 = mnum + pnum;
		setFirstName(s);
		if(total>=200||total1>=150) {
			System.out.println(getFirstName()+" "+" You are Eligible for admission");
		}else if(mnum>=60&&pnum>=50&&cnum>=40) {
			System.out.println(getFirstName()+" "+"You are Eligible for Admission");
		}else {
			System.out.println(getFirstName()+"You are not Eligible");
		}
	}
	public String getFirstName() {
		return firstName;
	}
	Admission(){
		Scanner sc = new Scanner(System.in);
		try{
		System.out.println("Enter your FirstName");
		String s = sc.next();
		System.out.println("Enter Marks of Maths Physics and Chemistry");
		int mnum = sc.nextInt();
		int pnum = sc.nextInt();
		int cnum = sc.nextInt();
		eligible(s,mnum,pnum,cnum);
		}catch(Exception e) {
			System.out.println("Pls enter Valid Number");
		};
	}
public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
public static void main(String[] args) {
	Admission[] u = new Admission[3];
	for(int i=0;i<3;i++) {
		u[i] = new Admission();
	}
}
}
