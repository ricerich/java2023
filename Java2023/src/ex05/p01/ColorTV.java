package ex05.p01;

public class ColorTV extends TV {

	private int nColor;

	public ColorTV(int size, int nColor) {
		super(size);
		this.nColor = nColor;
	}

	public void printProperty() {
		System.out.println(getSize()+"인치 "+nColor+" 컬러");
	}
}
