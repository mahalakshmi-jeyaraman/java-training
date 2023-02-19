

public class Que27 {

	public static void main(String[] args) {
		 int amount = 14000;
		    int result = ((amount+(40*amount/100))-1500);
		    result = result +(12*result/100);
		    System.out.println(result);

	}

}
/* P = 14000 
 * N = 1 -> P = 40% of 14000 + 14000 = 5600 + 14000 = 19600
 * N = 2 -> P = 19600 - 1500 = 18100
 * N = 3 -> P = 12% of 18100 + 18100 = 2172 + 18100 = 20272
*/