package productFactory;

import java.util.Date;

public class FoodProduct extends Product implements Locatable{
	private Date productionDate;
	int life;

	public FoodProduct(String description, String sku, double price, double tax, Date productionDate, int life) {
		super("Food", "5678", price, tax);
		this.productionDate = productionDate;
		this.life = life;
	}

	public Date getProductionDate() {
		return productionDate;
	}

	public void setProductionDate(Date productionDate) {
		this.productionDate = productionDate;
	}

	public int getLife() {
		return life;
	}

	public void setLife(int life) {
		this.life = life;
	}

	@Override
	public String getDepot() {
		String depot="Merkez";
		System.out.println("Depot is in the "+depot);
		return depot;
	}

	@Override
	public String getPlace() {
		String place="Edirne";
		System.out.println("Depot place is in the "+place);
		return place;
	}

}
