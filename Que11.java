
import java.util.Scanner;

public class Que11 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int [][] givenArray = new int[][]{{1},{2,3},{4,5,6},{7,8,9,10}};
		for(int rowIndex =0;rowIndex < givenArray.length; rowIndex++) {
			for(int columnIndex = 0;columnIndex < givenArray[rowIndex].length;columnIndex++) {
				 System.out.print(givenArray[rowIndex][columnIndex]+" ");
			}
			System.out.println();
		}
		scan.close();
	}
}