package ex05.p05;

public class ColorPoint extends Point {

	private String color;

	public ColorPoint(int x, int y, String color) {
		super(x, y);
		this.color = color;
	
	}

	public void setXY(int x, int y) {
		move(x,y);
	}

	@Override
	public String toString() {
		return color+"의 색은 ("+getX()+","+getY()+")의 점";
	}

	public void setColor(String color) {
		this.color = color;
	}

}
