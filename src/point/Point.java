package point;

public class Point {
	int x;
	int y;
	
	Point(int x, int y){
		this.x=x;
		this.y=y;
	}
	
	Point(int x){
		this(x,0);
	}

	Point(){
		this(0,0);
	}
	
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	double calculateDistanceToOrigin() {
		int x1=getX();
		int y1=getY();
		double distance=Math.sqrt((x1*x1)+(y1*y1));
		System.out.println("X:" +x1+ " Y:" +y1+ " koordinatlarýna sahip noktanýn orjine olan uzaklýðý: " + distance);
		return distance;
	}
	
	double calculateDistancToAnotherPoint(int a, int b) {
		double distance=Math.sqrt((Math.pow(getX()-a, 2))+(Math.pow(getY()-b,2)));
		System.out.println("(X1,Y1):" +"("+getX()+","+ getY()+") ve "+ "(X2,Y2):" +"("+a+","+b+") noktalarýnýn birbirine olan uzaklýðý: " +distance);
		return distance;
	}
	
	void clone(int x,int y) {
		setX(x);
		setY(y);
		System.out.println("Noktanýnýz yeni koordinatlarý: "+"("+x+","+y+")");
	}
	
	void move(int x, int y) {
		int x1=getX();
		int y1=getY();
		x1 +=x;
		y1 +=y;
		setX(x1);
		setY(y1);
		System.out.println("Noktanýnýz yeni koordinatlarý: "+"("+x1+","+y1+")");
	}
	
	public void printInfo() {
		System.out.println("\nPoint Info");
		System.out.println("X: " + x);
		System.out.println("Y: " + y);
	}
	
}
