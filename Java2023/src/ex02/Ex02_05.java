package ex02;
import java.util.Scanner;

public class Ex02_05 
{
	public static void main(String[] args) 
	{		
		Scanner sc1 = new Scanner(System.in);
		
		System.out.print("삼각형의 세 변을 입력해주세요>>");
		int n1 = sc1.nextInt();
		int n2 = sc1.nextInt();
		int n3 = sc1.nextInt();
		
		if(n1>n2+n3 || n2>n1+n3 || n3>n1+n2)
			System.out.println("삼각형을 만들수 없어요!");
		else
			System.out.println("삼각형이 됩니다!");
		
		sc1.close();
	}
}
