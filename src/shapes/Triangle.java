package shapes;

public class Triangle extends Shape{
	private int height;
	private int base;
	private int a;
	private int b;
	public Triangle(int height,int base,int a,int b) {
		super("Triangle");
		this.height=height;
		this.base=base;
		this.a=a;
		this.b=b;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public int getBase() {
		return base;
	}
	public void setBase(int base) {
		this.base = base;
	}
	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
	public int getB() {
		return b;
	}
	public void setB(int b) {
		this.b = b;
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
		double area=(base*height)/2;
		System.out.println("Triangle area is : " +area);
		return area;
	}
	@Override
	public double calculateCircumference() {
		double circumference=base+a+b;
		System.out.println("Triangle circumference is : " +circumference);
		return circumference;
	}
	@Override
	public int hashCode() {
		System.out.println("Hashcode: " +getName().hashCode());
		return getName().hashCode();
	}
	@Override
	public boolean equals(Object obj) {
		Triangle c1=(Triangle) obj;
		boolean a=false;
		if(getName()==c1.getName() && getBase()==c1.getBase()) {
			a=true;
		}
		System.out.println(a);
		return a;
	}
	@Override
	public String toString() {
		String s=new String();
		s="Name: "+getName()+" & a-b-c:"+getA()+getB()+getBase();
		System.out.println(s);
		return s;
	}
	
}
