package shapes;

public class Circle extends Shape {
	private double radius;

	public Circle(double radius) {
		super("Circle");
		this.radius=radius;
	}
	
	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}


	@Override
	public void draw() {
		super.draw();
	}

	@Override
	public void erase() {
		super.erase();
	}

	double pi=3.14;
	@Override
	public double calculateArea() {
		double area=pi*(Math.pow(radius, 2));
		System.out.println("Circle Area is: " +area);
		return area;
	}

	@Override
	public double calculateCircumference() {
		double circumference=2*pi*radius;
		System.out.println("Circle circumference is: " +circumference);
		return circumference;
	}

	@Override
	public int hashCode() {
		System.out.println("Hashcode: " +getName().hashCode());
		return getName().hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		Circle c1=(Circle) obj;
		boolean a=false;
		if(getName()==c1.getName() && getRadius()==c1.getRadius()) {
			a=true;
		}
		System.out.println(a);
		return a;
	}

	@Override
	public String toString() {
		String s=new String();
		s="Name: "+getName()+" & Radius:"+getRadius();
		System.out.println(s);
		return s;
	}



}
