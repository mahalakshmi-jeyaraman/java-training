package day2;
abstract class AbstractExample{
	
	public void display() {
		System.out.print("print abstract class without abstract method");
	}
}
public class Que12 extends AbstractExample{

	public static void main(String[] args) {
		AbstractExample example = new Que12();
		example.display();

	}

}
