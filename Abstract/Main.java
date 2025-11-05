package Abstract;

public class Main {

	public static void main(String[] args)
	{
		Animal demo = new Dog();//par pre, child
		demo.sound();
		//demo.eat();
		
		
		demo = new Cat(); //poly
		//demo.sound();
		demo.eat();
		
		
	}
}
