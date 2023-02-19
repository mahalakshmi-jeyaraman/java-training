//Write a program to find the location of element in the array

import java.util.Scanner;

public class Que8 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int size = scan.nextInt();
		int arr[] = new int[size];
		for(int i=0;i<size;i++) {
			arr[i] = scan.nextInt();
		}
		int find = scan.nextInt();
		for(int i=0;i<size;i++) {
			if(find == arr[i]) {
				System.out.println(i);
			}
		}
		scan.close();
		
	}

}
