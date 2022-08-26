package productFactory;

public class OldComputerSales implements Priceable, Locatable {
	private double price;
	private double tax;

	OldComputerSales(double price, double tax) {
		this.price = price;
		this.tax = tax;
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
	public String getDepot() {
		String depot = "Nilüfer";
		System.out.println("Depot is in the " + depot);
		return depot;
	}

	@Override
	public String getPlace() {
		String place = "Bursa";
		System.out.println("Depot place is in the " + place);
		return place;
	}

	@Override
	public double showPrice() {
		double priceToShow = getPrice();
		System.out.println("Computer price is : " + priceToShow);
		return priceToShow;
	}

	@Override
	public double showTax() {
		double taxToShow = getPrice();
		System.out.println("Computer tax is : " + taxToShow);
		return taxToShow;
	}

	@Override
	public void purchase() {
		System.out.println("Computer is being purchased.");
	}

}
