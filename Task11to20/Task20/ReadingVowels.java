package Task11to20.Task20;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
//"C:\Users\abhis\OneDrive\Desktop\S.txt"
public class ReadingVowels {
	 public static void main(String[] args) throws IOException {
		 int count=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a File Path");
		String path = sc.next();
		File f = new File(path);
		if(f.exists()==true) {
		System.out.println(path);
		BufferedReader br = new BufferedReader(new FileReader(f));
		
		while(true) {
			int s = br.read();
			if(s==-1) {break;}
			if(s=='a'||s=='e'||s=='i'||s=='o'|| s=='u'||s=='A'||s=='E'||s=='I'||s=='O'|| s=='U') {
				count++;
			}	
		}}else{System.out.println("File not Found");}System.out.println("Total Number of vowels--->"+count);
	}
}
