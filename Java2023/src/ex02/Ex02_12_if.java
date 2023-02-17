package ex02;
import java.util.Scanner;

public class Ex02_12_if {

	public static void main(String[] args) 
	{
		int a=0;
		int b=0;
		String op1 = "";		
				
		Scanner sc1 = new Scanner(System.in);
		System.out.print("연산(예: 1 + 3 ) >>");
		a = sc1.nextInt();
		op1 = sc1.next();
		b = sc1.nextInt();
		
		int result = 0;
//		if(op1 == "+")//이거 안됨, String 이라서
		if(op1.equals("+"))
			result = a + b;
		else if(op1.equals("-"))
			result = a - b;
		else if(op1.equals("*"))
			result = a * b;
		else if(op1.equals("/"))
		{
			if(b==0)
			{
				System.out.println("나누기는 0으로 나눌 수 없습니다!");
				sc1.close();
				return;
			}
			else	
				result = a / b;
		}
		else
		{
			System.out.println("사칙연산이 아닙니다!");
			sc1.close();
			return;
		}
		
		System.out.println(a+" "+op1+" "+b+"의 결과는 "+result+" 입니다");
		sc1.close();
	}

}
