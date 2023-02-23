package ex04.p08;

import java.util.Scanner;

public class PhoneBook 
{
	private Phone phoneArr[];
	
	private Scanner sc1;

	public PhoneBook() {
		sc1 = new Scanner(System.in);
	}
	
	public void run()
	{
		input();
			
		search();
	}
	
	private void input()
	{
		System.out.print("인원수>>");
		int cnt = sc1.nextInt();
		
		phoneArr = new Phone[cnt];
		
		for(int i=0; i<phoneArr.length;++i)
		{
			System.out.print("이름과 전화번호(공백없이) 입력 부탁>>");
			String name = sc1.next();
			String tel = sc1.next();
			phoneArr[i] = new Phone(name, tel);
		}
		System.out.println("저장되었습니다....");
//		sc1.close();//입력 작동안함
	}
	
	public void search()
	{
		while(true)
		{			
			System.out.print("검색할 이름>>");
			String name = sc1.next();
			
			if(name.equals("그만"))
			{
				System.out.println("종료합니다!");
				sc1.close();
				break;
			}
			
//			if(compare(name) == false) {
//				System.out.println(name + "의 전화번호는 없습니다!");
//			}
//			else
//				System.out.println(name + "의 전화번호는 "+tel+" 입니다");
			
			String tel = compare(name);			
			if(tel == null)
				System.out.println(name + "의 전화번호는 없습니다!");
			else
				System.out.println(name + "의 전화번호는 "+tel+" 입니다");
			
//			int i=0;
//			for(i=0; i<phoneArr.length;++i)
//			{
//				
//				if(name.equals(phoneArr[i].getName()))
//				{
//					String tel = phoneArr[i].getTel();
//					System.out.println(name + "의 전화번호는 "+tel+" 입니다");
//					break;
//				}				
//			}
			
//			if(i==phoneArr.length)
//				System.out.println(name + "의 전화번호는 없습니다!");
			
		}
		
	}
	
	String compare(String name) 
	{
		String tel=null;
//		boolean exist = false;
		
		for(int i=0; i<phoneArr.length;++i)
		{
			
			if(name.equals(phoneArr[i].getName()))
			{
				tel = phoneArr[i].getTel();
//				System.out.println(name + "의 전화번호는 "+tel+" 입니다");
//				exist = true;
				break;
			}				
		}
		return tel;
	}
	
	
	
	
}















