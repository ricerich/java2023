package ex04.p4;

public class Rectangle {

	private int x;
	private int y;
	private int w;
	private int h;

	public Rectangle(int x, int y, int w, int h) 
	{
		this.x = x;
		this.y = y;
		this.w = w;
		this.h = h;
	}

	public void show() {
		System.out.println("("+x+","+y+")에서 "); 
		System.out.println("크기가 "+w+" * "+h+" 인 사각형");
	}
	
	public int square() {
		return w*h;
	}

	public boolean contains(Rectangle s) 
	{
		if( (x < s.x) && (x+w > s.x+s.w)
		  &&(y < s.y) && (y+h > s.y+s.h))	
			return true;
		else
			return false;
	}
}










