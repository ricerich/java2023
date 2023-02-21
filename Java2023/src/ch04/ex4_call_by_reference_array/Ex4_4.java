package ch04.ex4_call_by_reference_array;

public class Ex4_4 {

	public static void main(String[] args) 
	{
//		ArrayParameter ap1 = new ArrayParameter();
////		ArrayParameter ap2 = new ArrayParameter();
//		
//		char c[] = {'T','h','i','s',' ','i','s',' ','a',' ','p','e','n','c','i','l','.'};
//		ap1.printCharArray(c);
//		ap1.replaceSpace(c);
//		ap1.printCharArray(c);
		
		char c[] = {'T','h','i','s',' ','i','s',' ','a',' ','p','e','n','c','i','l','.'};
		ArrayParameter.printCharArray(c);
		ArrayParameter.replaceSpace(c);
		ArrayParameter.printCharArray(c);
		
		ArrayParameter.a1 = 17;
		System.out.println(ArrayParameter.a1);
		
		ArrayParameter.setA1(24);
		System.out.println(ArrayParameter.a1);
		
		ArrayParameter ap1 = new ArrayParameter();
		ap1.setA1(100);
		System.out.println(ap1.a1);
		System.out.println(ArrayParameter.a1);
		
		ArrayParameter ap2 = new ArrayParameter();
		ap2.setA1(200);
		System.out.println(ap2.a1);
		System.out.println(ArrayParameter.a1);
		
		System.out.println(ap1.a1);//ap1을 다시 출력
		
		
		
	}

}















