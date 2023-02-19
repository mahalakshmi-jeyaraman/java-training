import java.util.*;
public class Que5 {
    static double giveAverage(int aNumber) {
		double result = 0;
		for(int index = 1;index<=aNumber;index++) {
			result += index; 
		}
		return result/aNumber;
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int aNumber = scan.nextInt();
		
		double result = giveAverage(aNumber);
		System.out.println(result);
		scan.close();

	}
}
