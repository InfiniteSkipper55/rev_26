package task6;

import java.util.Objects;

public class ProductSet {
	
	private int id;
	private String name;
	private double cost;
	private float rating;
	private int quantity;
	
	public ProductSet(int id, String name, double cost, float rating, int quantity) {
		super();
		this.id = id;
		this.name = name;
		this.cost = cost;
		this.rating = rating;
		this.quantity = quantity;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	public float getRating() {
		return rating;
	}

	public void setRating(float rating) {
		this.rating = rating;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return "ProductSet [id=" + id + ", name=" + name + ", cost=" + cost + ", rating=" + rating + ", quantity="
				+ quantity + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(cost, id, name, quantity, rating);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ProductSet other = (ProductSet) obj;
		return Double.doubleToLongBits(cost) == Double.doubleToLongBits(other.cost) && id == other.id
				&& Objects.equals(name, other.name) && quantity == other.quantity
				&& Float.floatToIntBits(rating) == Float.floatToIntBits(other.rating);
	}
	
	
	

}
