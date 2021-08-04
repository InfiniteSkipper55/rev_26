package task5;

import java.util.Comparator;

public class ProductQuantityComparator implements Comparator<Product>{
	
	@Override
	public int compare(Product p1, Product p2) {
		return new Integer(p2.getQuantity()).compareTo(p1.getQuantity());
	}

}
