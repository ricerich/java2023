package ex05.p11;

import java.util.Scanner;

public class CMain 
{
	public static void main(String[] args) 
	{
		Scanner sc1 = new Scanner(System.in);
		System.out.print("두 정수와 연산자를 입력해시오>>");
		int a = sc1.nextInt();
		int b = sc1.nextInt();
		char op1 = sc1.next().charAt(0);
		
		Calc obj1;
		switch(op1)
		{
			case '+': obj1 = new Add();
				break;
			case '-': obj1 = new Sub();
				break;
			case '*': obj1 = new Mult();
				break;
			case '/': obj1 = new Div();
				break;
			default:
				System.out.println("잘못된 연산입니다!");
				sc1.close();
				return;
		}
		
		obj1.setValue(a, b);
		
		if(obj1 instanceof Div && b==0) 
			System.out.println("0으로 나눌수 없어요!");
		else {
			int res = obj1.calculate();		
			System.out.println(res);
		}
		
		sc1.close();
	}

}








