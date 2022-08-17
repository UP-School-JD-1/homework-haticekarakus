package shapes;

public class Square extends Shape{
	private int kenar;
	public Square(int kenar) {
		super("Square");
		this.kenar=kenar;
	}
	public int getKenar() {
		return kenar;
	}
	public void setKenar(int kenar) {
		this.kenar = kenar;
	}
	
	@Override
	public void draw() {
		super.draw();
	}
	
	@Override
	public void erase() {
		super.erase();
	}
	
	@Override
	public double calculateArea() {
		double area=kenar*kenar;
		System.out.println("Square area is : " +area);
		return area;
	}
	@Override
	public double calculateCircumference() {
		double circumference=4*kenar;
		System.out.println("Square circumference is : " +circumference);
		return circumference;
	}
	@Override
	public int hashCode() {
		System.out.println("Hashcode: " +getName().hashCode());
		return getName().hashCode();
	}
	@Override
	public boolean equals(Object obj) {
		Square c1=(Square) obj;
		boolean a=false;
		if(getName()==c1.getName() && getKenar()==c1.getKenar()) {
			a=true;
		}
		System.out.println(a);
		return a;
	}
	@Override
	public String toString() {
		String s=new String();
		s="Name: "+getName()+" & Edge:"+getKenar();
		System.out.println(s);
		return s;		
	}
	

}
