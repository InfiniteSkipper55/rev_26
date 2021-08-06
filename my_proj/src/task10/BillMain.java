package task10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BillMain {

	public static void main(String[] args) {
		List<Bill> bList = new ArrayList<>();
		bList.add(new Bill("Beer     ", 200, 5));
		bList.add(new Bill("Champagne", 2000, 2));
		bList.add(new Bill("Whiskey  ", 800, 3));
		bList.add(new Bill("Rum      ", 900, 3));
		bList.add(new Bill("Scotch   ", 2500, 1));
		
		//Collections.sort(bList);
		System.out.println(" ----------------------------------------");
		System.out.println(" ItemName    Price    Quantity    Total");
		System.out.println(" ----------------------------------------");
		for(Bill b : bList) {
			b.printStatement();
		}
		System.out.println(" ----------------------------------------");
		double s = bList.stream().map(e -> e.getItemPrice()*e.getQuantity()).reduce(0.0, (sum, element) -> sum + element);
		System.out.println(" Total                            " + s);
		System.out.println(" GST of 5%                          " + s * 0.05);
		System.out.println(" ----------------------------------------");
		System.out.println(" Bill Total                       " + s * 1.05);

	}

}
