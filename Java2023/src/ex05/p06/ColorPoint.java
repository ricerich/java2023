package ex05.p06;

public class ColorPoint extends Point {

	private String color;

	public ColorPoint() {
		super(0,0);
		color = "BLACK";
	}
	
	public ColorPoint(int x, int y) {
		super(x,y);
	}

	public void setXY(int x, int y) {
		move(x,y);		
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return color+"의 색은 ("+getX()+","+getY()+")의 점";
	}

}
