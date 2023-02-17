package ex03;

import java.util.Scanner;

public class Ex03_08 {

	public static void main(String[] args) 
	{
		System.out.print("몇 개의 정수를 만들까요?>>");
		Scanner sc1 = new Scanner(System.in);
		int cnt = sc1.nextInt();
		
		if(cnt<=0 || cnt>100)
		{
			System.out.println("1~100사이의 정수를 입력해주세요");
			sc1.close();
			return;
		}
		
		int nArray[] = new int[cnt];
		
		for(int i=0;i<nArray.length;++i)
		{
			int n = (int)(Math.random()*100+1);
			for(int j=0;j<i;++j)
			{
				if(nArray[j] == n)
				{
					i--;
					break;
				}
				nArray[i]=n;
			}
		}
		
		int sum=0;
		for(int i=0;i<nArray.length;++i)
			sum = sum + nArray[i];
		
		System.out.println("랜덤 정수: ");
		for(int i=0;i<nArray.length;++i)
		{
			if(i%5==0)
				System.out.println("\n");
			System.out.print(nArray[i]+" ");
		}
	}

}
