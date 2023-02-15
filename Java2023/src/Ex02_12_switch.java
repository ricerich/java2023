import java.util.Scanner;

public class Ex02_12_switch {

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
		switch(op1)
		{
			case "+":
				result = a + b;
				break;
			case "-":
				result = a - b;
				break;
			case "*":
				result = a * b;
				break;
			case "/":
				
				if(b==0)
				{
					System.out.println("나누기는 0으로 나눌 수 없습니다!");
					sc1.close();
					return;
				}
				result = a / b;
				break;
			default :
				System.out.println("사칙연산이 아닙니다!");
				sc1.close();
				return;
		}
		System.out.println(a+" "+op1+" "+b+"의 결과는 "+result+" 입니다");
		sc1.close();
	}
}
