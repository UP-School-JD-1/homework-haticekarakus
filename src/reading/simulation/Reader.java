package reading.simulation;

public class Reader {
	String name;
	int age;
	char sex;
	
	Reader(String name, int age, char sex){
		this.name=name;
		this.age=age;
		this.sex=sex;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public char getSex() {
		return sex;
	}
	public void setSex(char sex) {
		this.sex = sex;
	}
	
	void read(Book book) {
		System.out.println("Su anda "+name+" tarafýndan " + book.title + " kitabý okunuyor.");
	}
	
}
