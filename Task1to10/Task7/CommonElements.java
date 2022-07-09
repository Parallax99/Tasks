package Task1to10.Task7;

import java.util.Scanner;

public class CommonElements {
	static void common(int a[],int b[]) {
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a.length;j++) {
				if(a[i]==b[j]) {
					System.out.println("Common Elements--->"+a[i]+",");
				}
			}
		}
	}
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the Size of Arrays");
	int size = sc.nextInt();
	int[] arr1 = new int[size];
	int[] arr2 = new int[size];
	System.out.println("Enter the Elements of Array1");
	for(int i=0;i<size;i++) {
		arr1[i]=sc.nextInt();
	}
	System.out.println("Enter the Elements of Array2");
	for(int i=0;i<size;i++) {
		arr2[i] =sc.nextInt();
	}
	common(arr1,arr2);
}
}
