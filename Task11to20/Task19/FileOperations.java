package Task11to20.Task19;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class FileOperations {
	public static void main(String[] args) throws IOException {
		File f = new File("Demo.txt");
		System.out.println(f.getAbsolutePath());
		File E = new File("Even.txt");
		File O = new File("Odd.txt");
		Scanner sc = new Scanner(System.in);
		
			PrintWriter pw = new PrintWriter(f);
			for(int i=0;i<10;i++) {
				System.out.println("Enter a number");
				pw.println(sc.nextInt());
			}
			pw.close();
		BufferedReader br = new BufferedReader(new FileReader(f));
		PrintWriter pw1 = new PrintWriter(E);
		PrintWriter pw2 = new PrintWriter(O);
		while(true) {
			String num = br.readLine();
			System.out.println(num);
			if(num==null) {
				break;
			}
			if(Integer.parseInt(num)%2==0) {
				pw1.println(num);
			}else {
				pw2.println(num);
			}
		}
		pw1.close();
		pw2.close();
		br.close();
	}
}
