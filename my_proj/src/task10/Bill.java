package task10;


public class Bill {
	private String itemName;
	private double itemPrice;
	private int quantity;
	
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public double getItemPrice() {
		return itemPrice;
	}
	public void setItemPrice(double itemPrice) {
		this.itemPrice = itemPrice;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	
	
	public Bill(String itemName, double itemPrice, int quantity) {
		super();
		this.itemName = itemName;
		this.itemPrice = itemPrice;
		this.quantity = quantity;
	}
	@Override
	public String toString() {
		return "Bill [itemName=" + itemName + ", itemPrice=" + itemPrice + ", quantity=" + quantity + "]";
	}
	
	public void printStatement() {		
		System.out.printf(" %s %9.2f %5d %14.2f\n", itemName, itemPrice, quantity, itemPrice*quantity);
	}
	
	

}
