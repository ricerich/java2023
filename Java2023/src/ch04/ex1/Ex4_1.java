package ch04.ex1;

public class Ex4_1 {

	public static void main(String[] args) 
	{
		Goods camera = new Goods();

//		camera.name = "Nikon";
//		camera.price = 400000;
//		camera.numberOfStock = 30;
//		camera.sold = 50;

		camera.setName("Nikon");
		camera.setPrice(400000);
		camera.setNumberOfStock(30);
		camera.setSold(50);
		
//		System.out.println("상품 이름:" + camera.name);
//		System.out.println("상품 가격:" + camera.price);
//		System.out.println("재고 수량:" + camera.numberOfStock);
//		System.out.println("팔린 수량:" + camera.sold);
		
		System.out.println("상품 이름:" + camera.getName());
		System.out.println("상품 가격:" + camera.getPrice());
		System.out.println("재고 수량:" + camera.getNumberOfStock());
		System.out.println("팔린 수량:" + camera.getSold());

	}

}
