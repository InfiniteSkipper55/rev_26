package getandset;

import java.util.Scanner;

public class GaSMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter id: ");
		int id = Integer.parseInt(sc.nextLine());
		
		System.out.println("Enter name: ");
		String name = sc.nextLine();
		
		System.out.println("Enter age: ");
		int age = Integer.parseInt(sc.nextLine());
		
		GetterAndSetter gs = new GetterAndSetter(id, name, age);
		System.out.println("Printing A1: ");
		pp(gs);
		
		// using setter functions separately for every variable
		System.out.println("Enter Id: ");
		GetterAndSetter gs1 = new GetterAndSetter();
		gs1.setId(Integer.parseInt(sc.nextLine()));
		
		System.out.println("Enter Name: ");
		gs1.setName(sc.nextLine());
		
		System.out.println("Enter Age: ");
		gs1.setAge(Integer.parseInt(sc.nextLine()));
		pp(gs1);
		
		

	}
	
	public static void pp(GetterAndSetter gas) {
		System.out.println("Id: " + gas.getId());
		System.out.println("Name: " + gas.getName());
		System.out.println("Age: " + gas.getAge());
	}

}
