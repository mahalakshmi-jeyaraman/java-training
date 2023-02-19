//Write a program to find the largest element in each row of a two dimensional array


import java.util.Scanner;

public class Que20 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int rows = scan.nextInt();
		int columns = scan.nextInt();
		int [][] givenArray = new int[rows][columns];
		for(int rowIndex=0;rowIndex<rows;rowIndex++) {
			for(int columnIndex=0;columnIndex<columns;columnIndex++) {
				givenArray[rowIndex][columnIndex] = scan.nextInt();
			}
		}
		for(int rowIndex=0;rowIndex<rows;rowIndex++) {
			int maxElement = 0;
			for(int columnIndex=0;columnIndex<columns;columnIndex++) {
				if(givenArray[rowIndex][columnIndex]>maxElement) {
					maxElement = givenArray[rowIndex][columnIndex];
				}
			}
			System.out.println(maxElement);
		}
		scan.close();
	}
}
