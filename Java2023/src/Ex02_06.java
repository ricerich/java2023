import java.util.Scanner;

public class Ex02_06 
{
	int a1;//멤버변수
	
	public static void main(String[] args) 
	{
		int n=0;//지역변수: main함수의 
		
		System.out.print("1~99 사이의 정수를 입력해주세요>>");
		Scanner sc1 = new Scanner(System.in);
		n = sc1.nextInt();
		
//		if(n<0 || n>99)
//		{
//			System.out.println("잘못 입력하셨습니다!");
//			return;
//		}
		
		if(n>=1 && n<=99)
		{
			int count=0;//3의 배수의 갯수, 1의 자리 갯수가 될수도 잇고, 10의 자리의 개수가 될수도 있음
			
			int ten=0;//지역변수: if문 지역의
			int one=0;
			ten = n / 10;
			one = n % 10;
			
			if(ten%3==0 && ten!=0)
				count++;
			
			if(one%3==0 && one!=0)
				count++;
			
			if(count == 2)
				System.out.println("박수짝짝!");
			else if(count == 1)
				System.out.println("박수짝!");
			else
				System.out.println("3,6,9가 하나도 없어요!");
		}
		else
			System.out.println("1~99사이의 수가 아닙니다!");
		
		
	
	}
}
