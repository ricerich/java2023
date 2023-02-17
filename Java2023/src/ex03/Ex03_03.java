package ex03;

import java.util.Scanner;

public class Ex03_03 {

	public static void main(String[] args) 
	{
		System.out.print("정수를 입력해주세요>>");
		Scanner sc1 = new Scanner(System.in);
		int n = sc1.nextInt();
		
		for(int i=n; i>=1; --i)
		{
			for(int j=0; j<i; ++j)
			{
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
