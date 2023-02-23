package ex04.p10;

import java.util.Scanner;

public class EX4_10 {

	public static void main(String[] args) 
	{
		Scanner sc1 = new Scanner(System.in);
		System.out.println("한영 검색 프로그램입니다");
		
		while(true)
		{
			System.out.print("한글단어?");
			String kor = sc1.next();
			
			if(kor.equals("그만")){
				System.out.println("종료합니다");
				break;
			}
//			Dictionary dic1 = new Dictionary();
//			String eng = dic1.kor2Eng(kor);
			String eng = Dictionary.kor2Eng(kor);
			
			if(eng == null)
				System.out.println(kor +"는 사전에 없는 단어입니다");
			else
				System.out.println(kor +"은 " + eng);
		}
		sc1.close();
	}
}







