//Write  a program to reverse elements in the array


import java.util.Scanner;

public class Que9 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int arraySize = scan.nextInt();
		int[] givenArray = new int[arraySize];
		for(int index = 0;index<arraySize;index++) {
			givenArray[index] =  scan.nextInt();
		}
		for(int index = arraySize-1;index>=0;index--) {
			System.out.print(givenArray[index]+ " ");
		}
		scan.close();
	}
}