package ex05.p09;

import java.util.Scanner;

public class CMain 
{
	public static void main(String[] args) {
		
		Scanner sc1 = new Scanner(System.in);
		System.out.print("총 스택 저장 공간 크기 입력>>");
		int capacity = sc1.nextInt();
		
		StringStack ss1 = new StringStack(capacity);
		
		while(true)
		{
			System.out.print("문자열 입력>>");
			String str1 = sc1.next();
			if(str1.equals("그만"))
				break;
			
			boolean b1 = ss1.push(str1);
			if(b1 == false)
				System.out.println("스택이 꽉찼어요!");
			
//			if(!ss1.push(str1))
//				System.out.println("스택이 꽉찼어요!");
			
		}
		
		System.out.print("스택에 저장된 모든 문자열 꺼내기(pop)");
		int size = ss1.length();
		for(int i=0; i<size;++i)
			System.out.print(ss1.pop() + " ");
		
		sc1.close();
		
	}

}








