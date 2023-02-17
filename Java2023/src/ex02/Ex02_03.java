package ex02;
import java.util.Scanner;

public class Ex02_03 
{
	public static void main(String[] args) 
	{
		int money=0;
		int count=0;
		
		final int 오만원권 = 50000;
		
		Scanner sc1 = new Scanner(System.in);
		
		System.out.print("금액을 입력해주세요>>");
		money = sc1.nextInt();
		
		count = money / 오만원권;//화폐의 갯수
		
		
		if(count > 0)
			System.out.println(오만원권 +"원 "+count+" 매");
		
		money = money % 오만원권;//돈 갱신: 나머지 연산으로 나머지 
		
		
		count = money / 10000;
		money = money % 10000;//돈 갱신: 나머지 연산으로 나머지 
		
		if(count > 0)
			System.out.println("만원권 "+count+" 매");
				
		count = money / 1000;
		money = money % 1000;//돈 갱신: 나머지 연산으로 나머지 
		
		if(count > 0)
			System.out.println("천원권 "+count+" 매");
		
		count = money / 500;
		money = money % 500;//돈 갱신: 나머지 연산으로 나머지
		if(count > 0)
			System.out.println("오백원짜리 "+count+" 개");
		
		count = money / 100;
		money = money % 100;//돈 갱신: 나머지 연산으로 나머지
		
		if(count > 0)
			System.out.println("백원짜리 "+count+" 개");
		
		count = money / 50;
		money = money % 50;//돈 갱신: 나머지 연산으로 나머지
		
		if(count > 0)
			System.out.println("오십원짜리 "+count+" 개");
		
		count = money / 10;
		money = money % 10;//돈 갱신: 나머지 연산으로 나머지
		
		if(count > 0)
			System.out.println("십원짜리 "+count+" 개");
		
		sc1.close();
	}
}
