package point;

public class PointTest {

	public static void main(String[] args) {
		Point point=new Point(5,5);
		Point point2=new Point(3,2);

		point.calculateDistanceToOrigin();
		point.calculateDistancToAnotherPoint(point2.x, point2.y);
		point.clone(4, 3);
		point2.move(0, 5);
		
		Point point3=new Point(7,6);
		point3.printInfo();
		
		Point point4=new Point(3);
		point4.printInfo();
		
		Point point5=new Point();
		point5.printInfo();
	}

}
