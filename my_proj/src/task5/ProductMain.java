package task5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ProductMain {

	public static void main(String[] args) {
		List<Product> proList = new ArrayList<>();
		proList.add(new Product(100, "ASUS FX503VD     ", 74000, 2, 4.6f));
		proList.add(new Product(202, "Lenovo FX503VD   ", 80000, 1, 3.6f));
		proList.add(new Product(504, "Alienware FX503VD", 90000, 3, 4.8f));
		proList.add(new Product(180, "HP FX503VD       ", 80000, 1, 3.4f));
		proList.add(new Product(102, "ASUS FX503VD     ", 59000, 4, 4.6f));
		
		printProductList(proList);
		Collections.sort(proList);
		
		System.out.println("\nPrinting product list in sorted manner based on id: ");
		printProductList(proList);
		
		Collections.sort(proList, new ProductNameComparator());
		System.out.println("\nPrinting product list based on name(Z-A): ");
		printProductList(proList);
		
		Collections.sort(proList, new ProductCostComparator());
		System.out.println("\nPrinting product list based on cost(High-Low): ");
		printProductList(proList);
		
		Collections.sort(proList, new ProductQuantityComparator());
		System.out.println("\nPrinting product list based on quantity(High-Low): ");
		printProductList(proList);
		
		Collections.sort(proList, new ProductRatingAndCostComparator());
		System.out.println("\nPrinting product list based on rating and cost(High-Low): ");
		printProductList(proList);
		
		
		//Solving using Lambda
		Collections.sort(proList, (Product p1, Product p2) -> {
			String name1 = p1.getName();
			String name2 = p2.getName();
			return name1.compareTo(name2);
		});
		System.out.println("\nPrinting product list based on name(Low-High) by lambda: ");
		printProductList(proList);
		
		Collections.sort(proList, (Product p1, Product p2) -> {
			Double d1 = p1.getCost();
			Double d2 = p2.getCost();
			return d1.compareTo(d2);
		});
		System.out.println("\nPrinting product list based on cost(Low-High) by lambda: ");
		printProductList(proList);
		
		Collections.sort(proList, (Product p1, Product p2) -> {
			Integer i1 = p1.getQuantity();
			Integer i2 = p2.getQuantity();
			return i1.compareTo(i2);
		});
		System.out.println("\nPrinting product list based on quantity(Low-High) by lambda: ");
		printProductList(proList);
		
		Collections.sort(proList, (Product p1, Product p2) -> {
			Float f1 = p1.getRating();
			Float f2 = p2.getRating();
			return f1.compareTo(f2);
		});
		System.out.println("\nPrinting product list based on rating(Low-High) by lambda: ");
		printProductList(proList);
		
		Collections.sort(proList, (Product p1, Product p2) -> {
			Float f1 = p1.getRating();
			Float f2 = p2.getRating();
			int x = f1.compareTo(f2);
			if(x == 0) {
				Double d1 = p1.getCost();
				Double d2 = p2.getCost();
				x = d1.compareTo(d2);
			}
			return x;
		});
		System.out.println("\nPrinting product list based on rating and cost(Low-High) by lambda: ");
		printProductList(proList);
		
		

	}
	
	public static void printProductList(List<Product> proList) {
		for(Product p : proList) {
			System.out.println(p);
		}
	}

}
