package ex03;

import java.util.Scanner;

public class Ex03_06 {

	public static void main(String[] args) 
	{
		int []unit = {50000,10000,1000,500,100,50,10,1};
		Scanner sc1 = new Scanner(System.in);
		
		System.out.print("금액을 입력해주세요>>");
		int money = sc1.nextInt();
		
		for(int i=0; i<unit.length;++i) { 
			int count = money/unit[i];
			if(count>0)
				System.out.println(unit[i]+"만원 짜리 "+count+"개");
			money = money%unit[i];
		}
		sc1.close();

	}

}
