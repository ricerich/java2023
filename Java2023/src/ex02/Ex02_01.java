package ex02;
import java.util.Scanner;

public class Ex02_01 
{
	public static void main(String[] args) 
	{
		double won = 0.0;
		double dollar = 0.0;
		double rate = 1216.0;
		
		Scanner sc1 = new Scanner(System.in);
		
		System.out.print("원화를 입력하세요(원화)>>");
		won = sc1.nextDouble();
		
		dollar = won / rate;
		
		dollar = (int)(dollar * 100)/100.0;
		
		System.out.println(won+"원은 "+dollar+"달러 입니다.");

		sc1.close();
	}
}
