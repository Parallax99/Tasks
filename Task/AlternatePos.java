package Task;

import java.util.Scanner;

public class AlternatePos {
	static void alter(int a[],int b[]) {
		int[] arr = new int[a.length];
		for(int i=0;i<a.length;i++) {
			if(i%2==0) {
				arr[i]=a[i];
			}else {
				arr[i]=b[i];
			}
		}
		System.out.println("Output----->");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		}
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the Size of the Array");
	int size = sc.nextInt();
	int[] arr = new int[size];
	int[] arr1 = new int[size];
	int[] arr2 = new int[size];
	System.out.println("Enter the Elements of Array");
	for(int i=0;i<size;i++) {
		arr[i] = sc.nextInt();
	}
	for(int i=0;i<size;i++) {
		if(arr[i]<0) {
			arr1[i]=arr[i];
	}
	for(int j=0;j<size;j++) {
		if(arr[j]>0) {
			arr1[j]=arr[j];
	}
	System.out.println("Input----->");
	for(int z=0;z<size;z++) {
		System.out.print(arr[z]+" ");
	}
	System.out.println(" ");
	alter(arr2,arr1);
	
}
	}
}
}
