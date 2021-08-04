package task3;

public class Trapezium extends Rectangle{
	
	public static float area(float x, float y, float h) {
		return ((x + y) * h) / 2;
	}
	
	public static void main(String[] args) {
		float x = 3.55f;
		float y = 3.5f;
		float h = 3.57f;
		System.out.println("Area of Square: " + area(x));
		System.out.println("Area of Rectangle: " + area(x, y));
		System.out.println("Area of Trapezium: " + area(x, y, h));

	}

}
