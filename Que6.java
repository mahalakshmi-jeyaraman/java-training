//Write a program to resize an array

import java.util.*;
public class Que6 {

	public static void main(String[] args) {
		System.out.println("We cannot resize the array because the aray size is fixed in java");
		System.out.println("But we can create one more array of new size and \nwe can copy the contents  of the previous array into the new array");
		Scanner scan = new Scanner(System.in);
		int originalSize = scan.nextInt();
		int [] originalArray = new int[originalSize];
		for(int index=0;index<originalSize;index++) {
			originalArray[index] = scan.nextInt();
		}
		int newSize = scan.nextInt();
		int [] reSizedArray = new int[newSize];
		for(int index=0;index<originalSize;index++) {
			reSizedArray[index] = originalArray[index];
		}
		originalArray = reSizedArray;
		System.out.println("the original size is "+ originalSize);
		System.out.print("the original array is ");
		for(int index=0;index<originalSize;index++) {
			System.out.print(originalArray[index]+ " ");
		}
		System.out.println();
		System.out.println("the new size is "+ newSize);
		System.out.print("the resized array is ");
		for(int index=0;index<originalArray.length;index++) {
			System.out.print(originalArray[index]+ " ");
		}
		System.out.println();
		scan.close();
	}

}
