package point;

public class PointTest {

	public static void main(String[] args) {
		Point point=new Point(5,5);
		Point point2=new Point(3,2);

		point.calculateDistanceToOrigin();
		point.calculateDistancToAnotherPoint(point2.x, point2.y);
		point.clone(4, 3);
		point2.move(0, 5);
	}

}
