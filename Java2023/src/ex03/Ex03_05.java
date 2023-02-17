package ex03;

import java.util.Scanner;

public class Ex03_05 {

	public static void main(String[] args) 
	{
		int nArray[] = new int[10];
		Scanner sc1 = new Scanner(System.in);

		System.out.println("양의 정수 10개를 입력해주세요>>");
		for(int i=0; i<nArray.length;++i)
			nArray[i] = sc1.nextInt();
		
		System.out.print("3의 배수는>>\t");
		for(int i=0; i<nArray.length;++i)
		{
			if(nArray[i]%3 == 0)
				System.out.print(nArray[i]+"\t");
		}
		
		

	}

}
