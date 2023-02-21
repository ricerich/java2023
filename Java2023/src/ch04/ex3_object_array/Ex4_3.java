package ch04.ex3_object_array;

import java.util.Scanner;

public class Ex4_3 {

	public static void main(String[] args) 
	{
//		Goods [] goodsArray;
//		goodsArray = new Goods [3];
		
		Goods [] goodsArray = new Goods [3];

         Scanner s = new Scanner(System.in);
		for(int i=0; i<goodsArray.length; i++) {
			String name = s.next();
			int price = s.nextInt();
			int n = s.nextInt();
			int sold = s.nextInt();
			goodsArray[i] = new Goods(name, price, n, sold);
//			goodsArray[i] = new Goods();
		}
		
		for(int i=0; i<goodsArray.length; i++) {
			System.out.print(goodsArray[i].getName()+" ");
			System.out.print(goodsArray[i].getPrice()+" ");
			System.out.print(goodsArray[i].getNumberOfStock()+" ");
			System.out.println(goodsArray[i].getSold());
		}

	}

}
