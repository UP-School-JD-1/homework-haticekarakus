package productFactory;

public abstract class BaseProduct {
	private String description;
	private String sku;
	public BaseProduct(String description, String sku) {
		this.description=description;
		this.sku=sku;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getSku() {
		return sku;
	}
	public void setSku(String sku) {
		this.sku = sku;
	}
	
}
