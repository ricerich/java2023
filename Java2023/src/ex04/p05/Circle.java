package ex04.p05;

public class Circle 
{
	private double x,y;
	private int radius;
//	private final double PI = 3.14;
	
	public Circle(double x, double y, int radius) {
		this.x = x;
		this.y = y;
		this.radius = radius;
	}
	
	public void show()
	{
		System.out.print(x+" ");
		System.out.print(y+" ");
		System.out.println(radius);
	}
	
	public double getArea()
	{
		return radius * radius * Math.PI;
	}

	public double getX() {
		return x;
	}

	public double getY() {
		return y;
	}

	public int getRadius() {
		return radius;
	}
}
