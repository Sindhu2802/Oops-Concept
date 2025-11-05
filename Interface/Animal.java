package Interface;

public interface Animal {
      //abstract void sound();
	  void sound();
     
}

interface Dog{

    void sound();
}

class Pet implements Animal,Dog{
	public void sound() {
		System.out.println("pet is making sound ");
	}
	
}

class Main{
	public static void main(String[] args)
	{
		Animal obj = new Pet();
		obj.sound();
	}
}