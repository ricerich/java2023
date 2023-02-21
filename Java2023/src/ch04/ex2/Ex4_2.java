package ch04.ex2;

public class Ex4_2 {

	public static void main(String[] args) 
	{
		MyExp number1 = new MyExp();
//		number1.base = 2;
//		number1.exp = 3;
		
		number1.setBase(2);
		number1.setExp(3);

		MyExp number2 = new MyExp();
//		number2.base = 3;
//		number2.exp = 4;
		number2.setBase(3);
		number2.setExp(4);
		
		MyExp number3 = new MyExp(2, 8);
		

		System.out.println(number1.getBase()+"의 "+number1.getExp()+"승 = " + number1.getValue());
		System.out.println("3의 4승 = " + number2.getValue());
		
		System.out.println("2의 8승 = " + number3.getValue());
	}

}









