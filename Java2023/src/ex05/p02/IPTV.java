package ex05.p02;

public class IPTV extends ColorTV {

	private String ip;

	public IPTV(String ip, int size, int nColor) {
		super(size, nColor);
		this.ip = ip;
	}
	
	public void printProperty() {
		System.out.println("나의 IPTV는 "+ip+" 주소의");
		super.printProperty();
		
	}

}
