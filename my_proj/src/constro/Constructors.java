package constro;

public class Constructors {
	
	public Constructors() {
		System.out.println("I am a default constructor and I will be called whenever the object is created");
	}
	
	public static void iAmStatic() {
		System.out.println("I am static method inside Constructors class");
	}
	
	public void iAmNonStatic() {
		System.out.println("I am non-static method inside Constructors class");
	}
	
	static {
		System.out.println("I am static block inside Constructors class");
	}
	
	{
		System.out.println("I am block inside Constructors class");
	}

}
