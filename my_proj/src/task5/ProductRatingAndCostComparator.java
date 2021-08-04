package task5;

import java.util.Comparator;

public class ProductRatingAndCostComparator implements Comparator<Product> {
	
	@Override
	public int compare(Product p1, Product p2) {
		int x = new Float(p2.getRating()).compareTo(p1.getRating());
		if(x == 0) {
			x = new Double(p2.getCost()).compareTo(p1.getCost());
		}
		return x;
	}

}
