package personList;

import java.util.List;

public class Person{
	private String firstName;
	private String lastName;
	private List<String> phone;
	private List<String> address;

	public Person(String firstName, String lastName, List<String> phone, List<String> address) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.phone = phone;
		this.address = address;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public List<String> getPhone() {
		return phone;
	}

	public void setPhone(List<String> phone) {
		this.phone = phone;
	}

	public List<String> getAddress() {
		return address;
	}

	public void setAddress(List<String> address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return  firstName + " " + lastName + " " + phone + " " + address;
	}
	
	

}
