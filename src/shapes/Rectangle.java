package shapes;

public class Rectangle extends Shape{
	private int kisaKenar;
	private int uzunKenar;
	public Rectangle(int kisaKenar,int uzunKenar) {
		super("Rectangle");
		this.kisaKenar=kisaKenar;
		this.uzunKenar=uzunKenar;
	}
	public int getKisaKenar() {
		return kisaKenar;
	}
	public void setKisaKenar(int kisaKenar) {
		this.kisaKenar = kisaKenar;
	}
	public int getUzunKenar() {
		return uzunKenar;
	}
	public void setUzunKenar(int uzunKenar) {
		this.uzunKenar = uzunKenar;
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
		double area=kisaKenar*uzunKenar;
		System.out.println("Rectangle area is: " +area);
		return area;
	}
	@Override
	public double calculateCircumference() {
		double circumference=2*(kisaKenar+uzunKenar);
		System.out.println("Rectangle circumference is: " +circumference);
		return circumference;
	}
	@Override
	public int hashCode() {
		System.out.println("Hashcode: " +getName().hashCode());
		return getName().hashCode();
	}
	@Override
	public boolean equals(Object obj) {
		Rectangle c1=(Rectangle) obj;
		boolean a=false;
		if(getName()==c1.getName() && getKisaKenar()==c1.getKisaKenar()) {
			a=true;
		}
		System.out.println(a);
		return a;
	}
	@Override
	public String toString() {
		String s=new String();
		s="Name: "+getName()+" & x-y:"+getKisaKenar()+getUzunKenar();
		System.out.println(s);
		return s;
	}
}
