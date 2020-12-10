/* creates class Product */
public class Product {
	private String name = null;
	private double price = 0.0;
	
	/* default constructor */
	public Product() {
		
	}

	/* overloaded constructor */
	public Product(String name, double price) {
		this.name = name;
		this.price = price;
	}
	
	/* mutator for name */
	public void setName(String name) {
		this.name = name;
	}
	
	/* accessor for name */
	public String getName() {
		return name;
	}
	
	/* mutator for price */
	public void setPrice(double price) {
		this.price = price;
	}
	
	/* accessor for price */
	public double getPrice() {
		return price;
	}
	
	/* worker method to reduce price */
	public void reducePrice(double amount) {
		this.price = price - amount;
	}
	
	/* worker method to print new price */
	public double printNewPrice() {
		double newPrice = this.price;
		return newPrice;
	}
	
}
