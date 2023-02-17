package ex03;

import java.util.Scanner;

public class Ex03_04 {

	public static void main(String[] args) 
	{
		Scanner sc1 = new Scanner(System.in);
		System.out.print("소문자 알파벳을 입력해주세요>>>");
		String s = sc1.next();
		
		if(s.length() != 1)
		{
			System.out.println("1글자만 입력해주세요!");
			sc1.close();
			return;
		}
		
		char c = s.charAt(0);
		if(c<'a' || c>'z')
		{
			System.out.println("소문자가 아닙니다!");
			sc1.close();
			return;
		}
		
		
		for(char i=c; i>='a';--i)
		{
			for(char j='a'; j<=i;++j)
			{
				System.out.print(i);
			}
			System.out.println();
		}
	}

}
