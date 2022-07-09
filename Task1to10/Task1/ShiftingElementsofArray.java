package Task1to10.Task1;

import java.util.Scanner;
public class ShiftingElementsofArray {
public static void main(String[]args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the size of array");
	int size = sc.nextInt();
	int[] arr = new int[size];
	System.out.println("Enter the Elements of Array");
	for(int i=0;i<size;i++) {
		arr[i] =sc.nextInt();	
	}
	System.out.println("Enter the amount of Right Shift to be done");
	int shiftkey=sc.nextInt();
	while(shiftkey!=0){
		int temp = arr[size-1];
	for(int i=size-1;i>0;i--) {
		arr[i]=arr[i-1];
				//System.out.print(arr[i]+",");
	}
	arr[0]=temp;
	shiftkey--;
}
	System.out.println("The array after shift");
	for(int i=0;i<size;i++) {
		System.out.print(arr[i]+",");
	}
}
}