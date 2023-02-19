//Write a program to reverse the elements of each row in a two dimensional array


import java.util.Scanner;

public class Que19 {

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
			for(int columnIndex=columns-1;columnIndex>=0;columnIndex--) {
				System.out.print(givenArray[rowIndex][columnIndex] + " "); 
			}
			System.out.println();
		}
		scan.close();
		
	}

}
