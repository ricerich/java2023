package ex02;
import java.util.Scanner;

public class Ex02_08 {

	public static void main(String[] args) 
	{
		Scanner sc1 = new Scanner(System.in);
		System.out.print("두 전 (x1,y1)과 (x2,y2)를 입력해주세요>>");
		int x1 = sc1.nextInt();
		int y1 = sc1.nextInt();
		int x2 = sc1.nextInt();
		int y2 = sc1.nextInt();
		
		//(x1,y1), (x2,y2)는 알고 있고 , (x1,y2),(x2,y1)는 유추
		if(inRect(x1,y1, 100,100,200,200)
		|| inRect(x2,y2, 100,100,200,200)
		|| inRect(x1,y2, 100,100,200,200)
		|| inRect(x2,y1, 100,100,200,200))
		{
			System.out.println("사각형 둘이 겹칩니다!");
		}
		//(100,100), (200,200)는 알고 있고 , (100,200),(200,100)는 유추
		else if(inRect(100,100, x1,y1,x2,y2)
			 || inRect(200,200, x1,y1,x2,y2)
			 || inRect(100,200, x1,y1,x2,y2)
			 || inRect(200,100, x1,y1,x2,y2))
		{
			System.out.println("사각형 둘이 겹칩니다!");
		}
		else
			System.out.println("사각형 안겹침!");
		
		
		

	}

	public static boolean inRect(int x, int y, 
								 int rectx1, int recty1, int rectx2, int recty2) 
	{
		if ((x >= rectx1 && x <= rectx2) && (y >= recty1 && y <= recty2))
			return true;
		else
			return false;
	}
}
