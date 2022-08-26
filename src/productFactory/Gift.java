package productFactory;

public class Gift extends BaseProduct implements Locatable{

	public Gift(String description, String sku) {
		super("Gift", "1");
	}

	@Override
	public String getDepot() {
		String depot="Kuzguncuk";
		System.out.println("Depot is in the "+depot);
		return depot;
	}

	@Override
	public String getPlace() {
		String place="Istanbul";
		System.out.println("Depot place is in the "+place);
		return place;	
	}

	public void prepare() {
		System.out.println("Gift is preparing.");
	}
}
