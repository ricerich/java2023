import java.util.Scanner;

public class Ex02_11_switch {

	public static void main(String[] args) 
	{
		Scanner sc1 = new Scanner(System.in);
		
		System.out.print("월(1~12)을 입력해주세요>>");
		int month = sc1.nextInt();
		
		switch(month)
		{
			case 3:
			case 4:
			case 5:
				System.out.println("봄");
				break;
			case 6:
			case 7:
			case 8:
				System.out.println("여름");
				break;
			case 9:
			case 10:
			case 11:
				System.out.println("가을");
				break;
			case 12:
			case 1:
			case 2:	
				System.out.println("겨울");
			default:
				System.out.println("(1~12)를 입력하셔야 합니다.");
		}
		sc1.close();
	}

}
