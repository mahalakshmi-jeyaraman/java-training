/*create a class with protected data. create a second class in the same file
with a method that manipulates the protected data in the first class*/

class FirstClass{
	protected int n = 12;
}
class SecondClass{
	FirstClass number = new FirstClass();
	int manipulateData() {
		number.n = 33;
		return number.n;
		
	}
}
public class Que23 {
	public static void main(String[] args) {
		SecondClass number = new SecondClass();
		System.out.println(number.manipulateData());
	}
}
