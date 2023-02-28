package ex05.p14;

public class Rect implements Shape {
	
	private int w, h;

	public Rect(int w, int h) {
		this.w = w;
		this.h = h;
	}

	@Override
	public void draw() {
		System.out.println(w+" * "+h+"의 사각형입니다");
	}

	@Override
	public double getArea() {
		return w*h;
	}
}
