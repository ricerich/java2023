package ex04.p03;

public class Song 
{
	private String title;
	private String artist;
	private int year;
	private String nation;
	
	public Song() {
		this.title = "무제";
		this.artist = "홍길동";
		this.year = 1999;
		this.nation = "한국";
	}

	public Song(String title, String artist, int year, String nation) {
		this.title = title;
		this.artist = artist;
		this.year = year;
		this.nation = nation;
	}
	
	public void show() {
		System.out.print(year+"년 ");
		System.out.print(nation+"국적의 ");
		System.out.print(artist+"가 ");
		System.out.println("부른 " + title);
	}
}
