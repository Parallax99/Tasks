package Task1to10.Task6;

import java.util.Scanner;

public class MoveElem {
	static int[] moveElem(int a[],int count) {
		while(count!=0) {
			for(int i=0;i<a.length;i++) {
				if(a[i]<0) {
					int temp =a[i];
					for(int j=i;j<a.length-1;j++) {
					a[j]=a[j+1];
					}
					a[a.length-1]=temp;
				}
			}count--;
		}
		return a;
	}
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the Size of the array");
	int size= sc.nextInt();
	int[] arr = new int[size];
	int count = 0;
	System.out.println("Enter the Elements of Array");
	for(int i=0;i<size;i++) {
		arr[i] = sc.nextInt();
		if(arr[i]<0) {
			count++;
		}
	}
	System.out.println("INPUT---->");
	for(int i=0;i<size;i++) {
		System.out.println(arr[i]+",");
	}
	System.out.println("OUTPUT---->");
	moveElem(arr,count);
	for(int i=0;i<size;i++) {
		System.out.print(arr[i]+",");
	}
}
}
