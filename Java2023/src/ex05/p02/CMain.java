package ex05.p02;

public class CMain {

	public static void main(String[] args) {
		IPTV iptv = new IPTV("192.1.1.2", 32, 2048); //"192.1.1.2" 주소에 32인치, 2048 컬러 
		iptv.printProperty();
	}

}
