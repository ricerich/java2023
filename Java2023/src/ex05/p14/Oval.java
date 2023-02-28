package ex05.p14;

public class Oval implements Shape {

	private int w, h;

	public Oval(int w, int h) {
		this.w = w;
		this.h = h;
	}

	@Override
	public void draw() {
		System.out.println(w+" * "+h+" 에 내접하는 타원입니다");
	}

	@Override
	public double getArea() {
		return (h/2) * (w/2) * PI;
	}

}
