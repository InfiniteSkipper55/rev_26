package my_pack;

public class DataTypes {
	public static void main(String[] args) {
		int x = 78;
		float y = 3.20f;
		double z = 5.36963;
		long w = 62654213L;
		boolean u = true;
		
		char a = (char)x;
		int b = (int)z;
		//int c = (int)u; //we cannot typecast boolean
		
		System.out.println("x = " + x);
		System.out.println("y = " + y);
		System.out.println("z = " + z);
		System.out.println("w = " + w);
		System.out.println("u = " + u);
		System.out.println("a = " + a);
		System.out.println("b = " + b);
	}

}
