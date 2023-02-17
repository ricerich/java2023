package ex02;
import java.util.Scanner;

public class Ex02_09 {

	public static void main(String[] args) 
	{
		double x=0;
		double y=0;
		double radius=0;

		double x1=0;
		double y1=0;
		
		Scanner sc1 = new Scanner(System.in);
		
		System.out.print("원의 중심점(x,y) 와 반지름을 입력해주세요>>");
		x=sc1.nextDouble();
		y=sc1.nextDouble();
		radius=sc1.nextDouble();
		
		System.out.print("한 점의 좌표(x,y)를 입력해주세요>>");
		x1=sc1.nextDouble();
		y1=sc1.nextDouble();
		
		double length = Math.sqrt((x-x1)*(x-x1) + (y-y1)*(y-y1));
		
		if(radius > length)
			System.out.println("점 ("+x+","+y+")는 원 안에 있습니다!");
		else if(radius < length)
			System.out.println("점 ("+x+","+y+")는 원 밖에 있습니다!");
		
		sc1.close();
	}
}
