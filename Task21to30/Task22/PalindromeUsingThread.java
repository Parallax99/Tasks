package Task21to30.Task22;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class PalindromeUsingThread extends Thread  {
	int a;
	int b;
	public PalindromeUsingThread(int a,int b) {
		this.a = a;
		this.b = b;
	}
	@Override
	public void run() {
		try{
		for(int i=a;i<b;i++) {
			
	        String line = Files.readAllLines(Paths.get("Palindrome.txt")).get(i);
	        String s = line.toLowerCase();
	        StringBuilder name = new StringBuilder(s);
			StringBuilder j = name.reverse();
			if (s.contentEquals(j)) {
				System.out.println(line + " "+"is palindrome");
			}
	      } 
		}
	      catch(IOException e){
	        System.out.println(e);
		}
	}

	public static void main(String[] args) throws IOException {
		 Path file = Paths.get("Palindrome.txt");

	      // read all lines of the file
	      long count = Files.lines(file).count();
	      int num = (int)count;
	     
	      PalindromeUsingThread a = new PalindromeUsingThread(0, num/10);
	      PalindromeUsingThread b = new PalindromeUsingThread(num/10,num/8);
	      PalindromeUsingThread c = new PalindromeUsingThread(num/8,num/6);
	      PalindromeUsingThread d = new PalindromeUsingThread(num/6,num/4);
	      PalindromeUsingThread e = new PalindromeUsingThread(num/4, num/2);
	      PalindromeUsingThread f = new PalindromeUsingThread(num/2, num);
	      a.start();
	      b.start();
	      c.start();
	      d.start();	
	      e.start();
	      f.start();
	}

}