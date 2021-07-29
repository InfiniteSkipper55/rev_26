package product;

public class ProductInfo {
	
	private int id;
	private String name;
	private double price;
	private static float discount = 2.6f;
	private static final float ADDITIONAL_DISC = 1.3f;

	public static void main(String[] args) {
		ProductInfo p = new ProductInfo();
		p.id = 56;
		p.name = "Lolz";
		p.price = 56.72;
		System.out.println("Product Info: ");
		p.pp();
		
		discount = 5.6f;
		ProductInfo p1 = new ProductInfo();
		p1.id = 56;
		System.out.println("\nProduct Info 1: ");
		p1.pp();
		
		System.out.println("\nProduct Info again: ");
		p.pp();
		

	}
	public void pp() {
		System.out.println("Product id: " + id);
		System.out.println("Product name: " + name);
		System.out.println("Product price: " + price);
		System.out.println("Product discount: " + discount);
	}

}
