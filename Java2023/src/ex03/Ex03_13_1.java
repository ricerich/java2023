package ex03;

public class Ex03_13_1 {

	public static void main(String[] args) 
	{
		for(int i=1; i<=99; i++)
		{
			int ten = i/10;//십의 자리수
			int one = i%10; //일의 자리수
			
			int cnt = 0;
			
			//if(ten%3==0 & ten !=0)
			if(ten==3 || ten==6 || ten==9)
				cnt++;
			if(one==3 || one==6 || one==9)
				cnt++;
		
			
			switch(cnt)
			{
				case 1:					
					System.out.println(i+"박수 짝");
					break;
				case 2:
					System.out.println(i+"박수 짝짝");
					break;
				default:
			}
		}
	}
}
