package productFactory;

public class ClothProduct extends Product implements Locatable{

	private String sex;
	private String size;

	public ClothProduct(String description, String sku, String sex, String size,double price,double tax) {
		super("Cloth", "12345",price,tax);
		this.sex=sex;
		this.size=size;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	@Override
	public String getDepot() {
		String depot="Kýzýlay";
		System.out.println("Depot is in the "+depot);
		return depot;
	}

	@Override
	public String getPlace() {
		String place="Ankara";
		System.out.println("Depot place is in the "+place);
		return place;
	}

}
