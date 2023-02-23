package ex04.p01;

public class TV {

	private String manufaturer;
	private int year;
	private int size;

	public TV(String manufaturer, int year, int size) 
	{
		this.manufaturer = manufaturer;
		this.year = year;
		this.size = size;
	}

	public void show() {
		System.out.print(manufaturer+"에서 만든 ");
		System.out.print(year+"년형 ");
		System.out.println(size+"인치 TV");
	}

}
