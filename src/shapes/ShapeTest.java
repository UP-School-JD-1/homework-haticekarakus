package shapes;

public class ShapeTest {

	public static void main(String[] args) {
		Shape shape1=new Circle(4);
		Shape shape5=new Circle(3);

		Shape shape2=new Rectangle(2,4);
		Shape shape6=new Rectangle(2,4);

		Shape shape3=new Square(3);
		Shape shape7=new Square(4);

		Shape shape4=new Triangle(3,4,5,6);
		Shape shape8=new Triangle(2,4,3,3);


		shape1.draw();
		shape1.erase();
		shape1.calculateArea();
		shape1.calculateCircumference();
		shape1.toString();
		shape1.equals(shape1);
		shape1.equals(shape5);
		shape1.hashCode();
		
		System.out.println("*********************************");
		
		shape2.draw();
		shape2.erase();
		shape2.calculateArea();
		shape2.calculateCircumference();
		shape2.toString();
		shape2.equals(shape2);
		shape2.equals(shape6);
		shape2.hashCode();
		
		System.out.println("*********************************");
		
		shape3.draw();
		shape3.erase();
		shape3.calculateArea();
		shape3.calculateCircumference();
		shape3.toString();
		shape3.equals(shape3);
		shape3.equals(shape7);
		shape3.hashCode();
		
		System.out.println("*********************************");
		
		shape4.draw();
		shape4.erase();
		shape4.calculateArea();
		shape4.calculateCircumference();
		shape4.toString();
		shape4.equals(shape4);
		shape4.equals(shape8);
		shape4.hashCode();

	}

}
