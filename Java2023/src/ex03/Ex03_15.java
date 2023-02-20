package ex03;

import java.util.Scanner;

public class Ex03_15 {

	public static void main(String[] args) 
	{
		Scanner sc1 = new Scanner(System.in);
		
		do
		{
			System.out.print("곱하고자 하는 두 수 입력>>");
			try {
				int n = sc1.nextInt();
				int m = sc1.nextInt();			
				System.out.println(n+" x "+m+" = "+n*m);
				break;
			}
			catch(Exception e)
			{
				System.out.println("실수는 입력안됩니다!");
				sc1.nextLine();
				continue;
			}
		}while(true);
		

		
		sc1.close();
	}

}
