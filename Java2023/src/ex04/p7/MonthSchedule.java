package ex04.p7;

import java.util.Scanner;

public class MonthSchedule {
	
	private int totalDay;
	private Day dayArray[];
	private Scanner sc1;

	public MonthSchedule(int nDay) 
	{
		this.totalDay = nDay;
		dayArray = new Day[nDay];
		for(int i=0; i<dayArray.length;++i) //한꺼번에 객체 30개 만들기
			dayArray[i] = new Day();
		
		sc1 = new Scanner(System.in);		
	}

	public void run() 
	{
		System.out.println("이번 달 스케쥴 관리 프로그램.");
		
		while(true)
		{
			System.out.print("할일(입력:1, 보기:2, 종료:3)>>");
			int option = sc1.nextInt();
			
//			if(option == 3)
//				break;
			
			switch(option)
			{
				case 1://입력
					input();					
					break;
				case 2://보기
					view();
					break;
				case 3://종료
					finish();
//					break;
					return;
				default:
					System.out.println("1,2,3 중에 입력해주세요");
			}
			
		}
	}
	
	private void input() {
		//dayArray[1] = new Day();
		
		System.out.print("날짜(1~30)?");
		
		int nDay = sc1.nextInt();
		
		System.out.print("할일을 입력해주세요(빈칸없이)>>");
		String work = sc1.next();
		
		if(nDay<1 || nDay>this.totalDay)
			System.out.println("1~30 사이의 수를 입력해주셔야 합니다");
//		
//		Day d1 = new Day();
//		dayArray[nDay-1] = d1;
		
//		dayArray[nDay-1] = new Day();//위에서 한꺼번에 만듦
		
//		dayArray[nDay-1].work = work;//private 멤버변수 work
		dayArray[nDay-1].set(work);
	}
	
	private void view()
	{
		System.out.print("날짜(1~30)?");
		int nDay = sc1.nextInt();
		
		if(nDay<1 || nDay>this.totalDay)
			System.out.println("1~30 사이의 수를 입력해주셔야 합니다");
		
		System.out.print(nDay+"일의 할 일은 ");
		dayArray[nDay-1].show();
	}
	
	private void finish()
	{
		System.out.println("프로그램을 종료합니다.");
		sc1.close();
	}
	
	

}
