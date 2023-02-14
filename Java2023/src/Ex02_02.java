import java.util.Scanner;

public class Ex02_02 
{
	public static void main(String[] args) 
	{
		int num = 0;
		int ten = 0;
		int one = 0;
		
		Scanner sc1 = new Scanner(System.in);
		
		System.out.print("2자리의 정수 입력(0~99)>>");
		num = sc1.nextInt();
		
		if(num >= 100)
		{
			System.out.println("지대로 입력해주세요!");
			sc1.close();
			return;
		}
		
		ten = num / 10;//몫: 10의 자리
		one = num % 10;//나머지: 1의 자리
		
		if(ten == one)
			System.out.println("Yes! 10의 자리와 1의 자리가 같습니다.");
		else
			System.out.println("No! 10의 자리와 1의 자리가 다릅니다.");
		
		sc1.close();
	}
}
