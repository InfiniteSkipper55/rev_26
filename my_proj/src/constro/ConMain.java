package constro;

public class ConMain {
	
	public ConMain() {
		System.out.println("I will be called whenever the object is created bro");
	}

	public static void main(String[] args) {
		iAmStatic();
		ConMain cm = new ConMain();
		cm.iAmNonStatic();
		
		Constructors.iAmStatic();
		Constructors cs = new Constructors();
		cs.iAmNonStatic();

	}
	
	public static void iAmStatic() {
		System.out.println("I am static method inside ConMain class");
	}
	
	public void iAmNonStatic() {
		System.out.println("I am non-static method inside ConMain class");
	}
	
	static {
		System.out.println("I am static block inside ConMain class");
	}
	
	{
		System.out.println("I am block inside ConMain class");
	}

}
