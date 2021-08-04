package task5;

import java.util.Comparator;

public class ProductCostComparator implements Comparator<Product>{
	
	@Override
	public int compare(Product p1, Product p2) {
		return new Double(p2.getCost()).compareTo(p1.getCost());
	}

}
