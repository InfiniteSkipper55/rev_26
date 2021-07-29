package my_pack;
import java.util.Scanner;
public class InputTypes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		
		int p = Integer.parseInt(sc.nextLine());
		long c = Long.parseLong(sc.nextLine());
		
		System.out.println("c = "+c);
		System.out.println("S = "+s);
		System.out.println("p = "+p);
	}

}
