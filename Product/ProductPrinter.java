/* test class */
public class ProductPrinter {

	public static void main(String[] args) {
		double newPrice = 0.0;
		String outputText = null;
		Product product1 = new Product(); //creates new object
		
		/* mutator methods called */
		product1.setName("Toaster");
		product1.setPrice(29.95);
		
		System.out.printf( "%s%n$%.2f%n", product1.getName(), product1.getPrice()); //outputs the first product and price
		product1.reducePrice(5); //calls reducePrice method
		newPrice = product1.printNewPrice(); //calls printNewPrice method
		outputText = String.format("New price of %s is $%.2f", product1.getName(), newPrice);
		System.out.println(outputText);
		
		
		Product product2 = new Product("Doughnut", 10.0); //creates another object
		System.out.println(); //empty line
		System.out.printf( "%s%n$%.2f%n", "Doughnut", 10.0);
		product2.reducePrice(5);
		newPrice = product2.printNewPrice();
		outputText = String.format("New price of %s is $%.2f", "Doughnut", newPrice);
		System.out.println(outputText);
	}

}
