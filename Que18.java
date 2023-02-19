
import java.util.*;
public class Que18 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
        String number = scan.next();
        String[] words = {"zero","one","two","three","four","five","six","seven","eight","nine"};
        for(int i=0;i<number.length();i++){
            System.out.print(words[(int)(number.charAt(i) -'0')]+" ");
        }
        scan.close();
	}
}
