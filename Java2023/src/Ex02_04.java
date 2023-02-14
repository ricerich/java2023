import java.util.Scanner;

public class Ex02_04 
{
	public static void main(String[] args) 
	{
		int n1, n2, n3;
		int middle;
				
		Scanner sc1 = new Scanner(System.in);
		System.out.print("정수 3개를 입력해주세요>>");
		n1 = sc1.nextInt();
		n2 = sc1.nextInt();
		n3 = sc1.nextInt();
		
		if( ((n1>n2) && (n1<n3)) || ((n1>n3) && (n1<n2)))
		{
			middle = n1;
		}
		else if( ((n2>n1) && (n2<n3)) || ((n2>n3)&&(n2<n1)) )
		{
			middle = n2;
		}
		else
		{
			middle = n3;
		}
		
		System.out.print("크기가 중간인 값은>>" + middle);
		sc1.close();
	
	}

}
