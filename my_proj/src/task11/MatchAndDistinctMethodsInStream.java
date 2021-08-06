package task11;

import java.util.ArrayList;
import java.util.List;

public class MatchAndDistinctMethodsInStream {

	public static void main(String[] args) {
		List<Bus> busList = new ArrayList<>();
		busList.add(new Bus(100, "Abc Travels", 1200.22, 2.3f));
		busList.add(new Bus(101, "Abc Travels", 1100.22, 2.4f));
		busList.add(new Bus(190, "Xyz Travels", 1100.22, 2.3f));
		busList.add(new Bus(200, "Jee Travels", 1000.22, 4.3f));
		busList.add(new Bus(104, "Java Travels", 900.22, 4.3f));
		busList.add(new Bus(111, "Xyz Travels", 1400.22, 4.3f));
		
		boolean b1 = busList.stream().allMatch(e -> e.getId() < 150 && e.getProviderName().startsWith("A"));
		System.out.println("AllMatch method: " + b1);
		
		boolean b2 = busList.stream().allMatch(e -> e.getCost() < 1000);
		System.out.println("AllMatch method: " + b2);
		
		boolean b3 = busList.stream().anyMatch(e -> e.getId() < 150 && e.getProviderName().startsWith("A"));
		System.out.println("AnyMatch method: " + b3);
		
		boolean b4 = busList.stream().allMatch(e -> e.getCost() < 1000);
		System.out.println("AnyMatch method: " + b4);
		
		boolean b5 = busList.stream().noneMatch(e -> e.getCost() < 1000);
		System.out.println("AllMatch method: " + b5);
	}

}
