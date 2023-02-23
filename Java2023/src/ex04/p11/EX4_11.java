package ex04.p11;

import java.util.Scanner;

public class EX4_11 {

	public static void main(String[] args) 
	{
		Scanner sc1 = new Scanner(System.in);
		System.out.print("두 정수와 연사자를 입력해주세요>>");
		int a = sc1.nextInt();
		int b = sc1.nextInt();
		String op1 = sc1.next();
		char ch1 = op1.charAt(0);
		
		Calc obj1;
		switch(ch1)
		{
			case '+':
				obj1 = new Add();
				obj1.setValue(a, b);
				System.out.println(obj1.calculate());
				
			case '-':
				obj1 = new Sub();
				obj1.setValue(a, b);
				System.out.println(obj1.calculate());
				break;
			case '*':
				obj1 = new Mult();
				obj1.setValue(a, b);
				System.out.println(obj1.calculate());
				break;
			case '/':
				obj1 = new Div();
				obj1.setValue(a, b);
				System.out.println(obj1.calculate());
				break;
			default:
				System.out.println("연산자를 잘못 입력하셨습니다");
		}
		
//		if(op1.equals("+"))
//		{
//			Add obj1 = new Add();
//			obj1.setValue(a, b);
//			System.out.println(obj1.calculate());
//		}
//		else if(op1.equals("-"))
//		{
//			Sub obj1 = new Sub();
//			obj1.setValue(a, b);
//			System.out.println(obj1.calculate());
//		}
//		else if(op1.equals("*"))
//		{
//			Mult obj1 = new Mult();
//			obj1.setValue(a, b);
//			System.out.println(obj1.calculate());
//		}
//		else if(op1.equals("/"))
//		{
//			Div obj1 = new Div();
//			obj1.setValue(a, b);
//			System.out.println(obj1.calculate());
//		}
	}
}

class Calc{
	private int a, b;	
	public void setValue(int a, int b)
	{
		this.a = a;
		this.b = b;
	}
	public int calculate()
	{
		return 0;
	}
}

class Add extends Calc
{
	private int a, b;	
	
	public void setValue(int a, int b)
	{
		this.a = a;
		this.b = b;
	}
	
	public int calculate()
	{
		return a+b;
	}
}

class Sub extends Calc
{
	private int a, b;	
	
	public void setValue(int a, int b)
	{
		this.a = a;
		this.b = b;
	}
	
	public int calculate()
	{
		return a-b;
	}
}

class Mult extends Calc
{
	private int a, b;	
	
	public void setValue(int a, int b)
	{
		this.a = a;
		this.b = b;
	}
	
	public int calculate()
	{
		return a*b;
	}
}

class Div extends Calc
{
	private int a, b;	
	
	public void setValue(int a, int b)
	{
		this.a = a;
		this.b = b;
	}
	
	public int calculate()
	{
		return a/b;
	}
}


