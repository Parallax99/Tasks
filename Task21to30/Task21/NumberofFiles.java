package Task21to30.Task21;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NumberofFiles {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count=0;
		System.out.println("Enter Path of Folder");
		String s = sc.next();
		File f = new File(s);
		if(f.isDirectory()==true) {
			File[] Files = new File[100];
			Files = f.listFiles();
			for(File file:Files) {
				if(file.getName().endsWith(".java")) {
					count++;
				}
			}System.out.println("Total Number of Java files--->"+count);
		}else {System.out.println("Directory not Found");}
	}
}
