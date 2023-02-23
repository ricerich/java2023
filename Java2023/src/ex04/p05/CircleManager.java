package ex04.p05;

import java.util.Scanner;

public class CircleManager 
{
	void run(){
		Scanner scanner = new Scanner(System.in);
		
		Circle c[] = new Circle[3];
		
		for(int i=0; i<c.length;++i)
		{
			System.out.print("x, y, radius >>");
			double x = scanner.nextDouble();
			double y = scanner.nextDouble();
			int radius = scanner.nextInt();
			c[i] = new Circle(x,y,radius);
		}
		
		for(int i=0; i<c.length;++i)
		{
			c[i].show();
			
//			System.out.println("===========");
//			
//			System.out.print(c[i].getX()+" ");
//			System.out.print(c[i].getY()+" ");
//			System.out.println(c[i].getRadius());
		}
		
//		double max=0;
		int max_index=0;
		for(int i=0; i<c.length;++i)
		{
//			if(c[i].getArea() > max)
//			{
//				max = c[i].getArea();
//				max_index = i;
//			}
			
			if(c[i].getArea() > c[max_index].getArea())
			{
//				max = c[i].getArea();
				max_index = i;
			} 
		}
		
		System.out.print("가장 면적이 큰 원은 ");
		c[max_index].show();
		
		scanner.close();
		
	}
}









