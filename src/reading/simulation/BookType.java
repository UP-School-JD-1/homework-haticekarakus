package reading.simulation;

public enum BookType {
	FICTION("kurgusal"),NON_FICTION("kurgusal olmayan"),SCIENTIFIC("bilimsel"),COMEDY("komedi"),POETRY("þiir");
	private String description;

	private BookType(String description) {
		this.description = description;
	}


	public void setDescription(String description) {
		this.description = description;
	}
	
}
