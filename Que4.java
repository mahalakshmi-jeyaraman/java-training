//Write a program to find weather a number is prime or not
import java.util.*;
public class Que4 {
	static boolean checkPrime(int aNumber) {
		boolean result = true;
		if(aNumber <= 1) {
			result = false;
			return result;
		}
		else {
			for (int divisor=2;divisor<aNumber;divisor++) {
				if(aNumber % divisor == 0) {
					result = false;
				}
			}
			return result;
		}
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int aNumber = scan.nextInt();
		scan.close();
		boolean result = checkPrime(aNumber);
		
		if(result == true) {
			System.out.println("prime number...");
		}
		else {
			System.out.println("not a prime number...");
		}

	}

}

// a prime number example 2,3,5.. so greater than 1 
//which is divisible by itself and 1 
//should not divisible by other numbers