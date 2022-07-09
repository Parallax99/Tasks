package Task;

import java.util.Scanner;

public class Cricketer {
	private String name;
	private int matchPlayed;
	private int rank;
	public void getData(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Name MatchPlayed");
		name = sc.next();
		matchPlayed = sc.nextInt();
		CalculateRank(matchPlayed);
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMatchPlayed() {
		return matchPlayed;
	}
	public void setMatchPlayed(int matchPlayed) {
		this.matchPlayed = matchPlayed;
	}
	public int getRank() {
		return rank;
	}
	public void setRank(int rank) {
		this.rank = rank;
	}
	public int CalculateRank(int matchPlayed2) {
		if(matchPlayed>=150) {
			rank = 1;
		}else if(matchPlayed>=100) {
			rank = 3;
		}else if(matchPlayed>=50) {
			rank =5;
		}else if(matchPlayed<50) {
			rank = 100;
		}
		return rank;
	}
	public void Display() {
		System.out.println("Name     :"+ name);
		System.out.println("MatchPlayed     :"+ matchPlayed);
		System.out.println("Rank     :"+ rank);
	}
public static void main(String[] args) {
	Cricketer C[] = new Cricketer[3];
	for(int i=0;i<3;i++) {
		 C[i] = new Cricketer();
		 C[i].getData();
	}
	for(int i=0;i<3;i++) {
		C[i].Display();
	}
}
}
