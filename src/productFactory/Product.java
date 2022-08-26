package productFactory;

public class Product extends BaseProduct implements Priceable{
	private double price;
	private double tax;
	public Product(String description, String sku,double price,double tax) {
		super("Products", "123456");
		this.price=price;
		this.tax=tax;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getTax() {
		return tax;
	}

	public void setTax(double tax) {
		this.tax = tax;
	}

	@Override
	public double showPrice() {
		double priceToShow=getPrice();
		System.out.println(getDescription()+" price is : "+priceToShow);
		return priceToShow;
	}

	@Override
	public double showTax() {
		double taxToShow=getTax();
		System.out.println(getDescription()+" tax is : "+taxToShow);
		return taxToShow;
	}

	@Override
	public void purchase() {
		System.out.println(getDescription()+" is being purchased.");
	}
	

}
