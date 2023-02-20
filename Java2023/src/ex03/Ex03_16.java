package ex03;

import java.util.Scanner;

public class Ex03_16 {

	public static void main(String[] args) 
	{
		Scanner sc1 = new Scanner(System.in);
		
		System.out.println("컴퓨터와 가위바위보 게임을 합니다!");
		
		while(true)
		{
			System.out.print("가위 바위 보! >>");
			String user1 = sc1.next();//사용자 입력 가위, 바위 , 보
			
			if(user1.equals("그만"))
			{
				System.out.println("종료합니다");
				break;
			}
			
			String str [] = {"가위", "바위", "보"};
			int n = (int)(Math.random()*3); //컴퓨터가 낸것을 랜덤하게 선택
			String com1 = str[n];
			
			System.out.println("나는 "+user1 +", 컴퓨터는 "+com1 +"를 냈습니다!");
			
		    if(user1.equals("가위"))  
		    {
		    	if(com1.equals("가위"))
		    		System.out.println("비겼습니다.");
		    	else if(com1.equals("바위"))
		    		System.out.println("내가 졌습니다.");
		    	else if(com1.equals("보"))
		    		System.out.println("내가 이겼습니다.");
		        	
	        }
		    else if(user1.equals("바위"))  
		    {
		    	if(com1.equals("가위"))
		    		System.out.println("내가 이겼습니다.");
		    	else if(com1.equals("바위"))
		    		System.out.println("비겼습니다.");
		    	else if(com1.equals("보"))
		    		System.out.println("내가 졌습니다.");
	        }
		    else if(user1.equals("보"))  
		    {
		    	if(com1.equals("가위"))
		    		System.out.println("내가 졌습니다.");
		    	else if(com1.equals("바위"))
		    		System.out.println("내가 이겼습니다.");
		    	else if(com1.equals("보"))
		    		System.out.println("비겼습니다.");
	        }
		    else
		    	System.out.println("가위 바위 보 중에서 입력해주세요");
		}
		sc1.close();
	}
}
