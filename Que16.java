//Write a program to search a given element is present or not?
//if present display the location and how many time it occurs


import java.util.Scanner;

public class Que16 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int size = scan.nextInt();
		int arr[] = new int[size];
		for(int i=0;i<size;i++) {
			arr[i] = scan.nextInt();
		}
		int find = scan.nextInt();
		int count=0;
		for(int i=0;i<size;i++) {
			if(find == arr[i]) {
				System.out.println("the index is "+i);
				count++;
				
			}
		}
		System.out.println(count);
		scan.close();

	}

}
