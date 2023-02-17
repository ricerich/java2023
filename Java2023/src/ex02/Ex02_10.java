package ex02;
import java.util.Scanner;

public class Ex02_10 {

	public static void main(String[] args) 
	{
		double x1=0;
		double y1=0;
		double radius1=0;

		double x2=0;
		double y2=0;
		double radius2=0;
		
		Scanner sc1 = new Scanner(System.in);
		
		System.out.print("원1의 중심점(x1,y1) 와 반지름을 입력해주세요>>");
		x1=sc1.nextDouble();
		y1=sc1.nextDouble();
		radius1=sc1.nextDouble();
		
		System.out.print("원2의 중심점(x2,y2) 와 반지름을 입력해주세요>>");
		x2=sc1.nextDouble();
		y2=sc1.nextDouble();
		radius2=sc1.nextDouble();
		
		double length = Math.sqrt((x1-x2)*(x1-x2) + (y1-y2)*(y1-y2));
		
		double radiusSum = radius1 + radius2;
		
		if(radiusSum > length)
			System.out.println("겹칩니다!");
		else if(radiusSum < length)
			System.out.println("안 겹칩니다!");
		
		sc1.close();
	

	}

}
