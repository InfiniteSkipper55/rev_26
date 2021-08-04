package task6;

import java.util.HashSet;
import java.util.Set;

public class ProductSetMain {

	public static void main(String[] args) {
		
		Set<ProductSet> hs = new HashSet<>();
		hs.add(new ProductSet(875, "Headphones", 1200, 4.3f, 2));
		hs.add(new ProductSet(855, "Earphones ", 1000, 4.2f, 4));
		hs.add(new ProductSet(852, "Jacket    ", 12000, 4.5f, 1));
		hs.add(new ProductSet(854, "Scarf     ", 500, 3.1f, 3));
		hs.add(new ProductSet(865, "Towel     ", 200, 4.4f, 5));
		hs.add(new ProductSet(485, "Trouser   ", 1500, 4.5f, 3));
		hs.add(new ProductSet(875, "Book      ", 100, 3.9f, 2));
		hs.add(new ProductSet(851, "Container ", 700, 2.3f, 1));
		hs.add(new ProductSet(785, "Shirt     ", 900, 4.2f, 5));
		hs.add(new ProductSet(963, "Fridge    ", 5000, 4.8f, 1));
		hs.add(new ProductSet(552, "Bag       ", 2000, 4.0f, 1));
		
		printProductList(hs);
		

	}
	
	public static void printProductList(Set<ProductSet> hs) {
		for(ProductSet ps : hs) {
			if(!hs.add(ps)) {
				System.out.println(ps);
			}
			
		}
		
		
	}

}
