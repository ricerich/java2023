package ex05.p12;

import java.util.Scanner;

public class GraphicEditor 
{
//	private String name;
	private Shape start;
	private Shape last;
	private Scanner sc1;
	
	
	public GraphicEditor()
	{
//		this.name = name;
		start = null;
		last = null;
		sc1 = new Scanner(System.in);
	}
	
	void run()
	{
		System.out.println("그래픽 에디터 실행합니다");
		
		while(true)
		{
			System.out.print("삽입(1), 삭제(2), 모두보기(3), 종료(4) >>");
			int option = sc1.nextInt();
			
			switch(option)
			{
				case 1:
					System.out.print("Line(1), Rect(2), Circle(3) >>");
					int type = sc1.nextInt();
					insert(type);
					break;
				case 2:
					System.out.print("삭제할 도형의 위치>>");
					int postion = sc1.nextInt();
					delete(postion);
					break;
				case 3:
					view();
					break;
				case 4:
					System.out.println("종료합니다.");
					break;
				default:
			}
		}
	}
	
	void insert(int type) {
		Shape obj=null;
		switch(type)
		{
			case 1:
				obj = new Line();
				break;
			case 2:
				obj = new Rect();
				break;
			case 3:
				obj = new Circle();
				break;
		}
		
		if(start == null)//제일처음일때,아무것도 없을때
		{
			start = obj;
			last = obj;
		}
		else
		{
//			last.next = obj;
			last.setNext(obj);
			last = obj;
		}
	}
	
	void delete(int postion)
	{
		Shape current = start;
		Shape previous = start;
		
		if(start == null)
			return;
		
		if(start == last)
		{
			start = null;
			last = null;
			return;
		}
		
		for(int i=0;i<postion;i++)
		{
			previous = current;
			current = current.getNext();
			
			if(current == null) //마지막이면
				return;
		}
		
		if(current == start)
			start = start.getNext();
		else if(current == last)
		{
			last = previous;
			last.setNext(null);
		}
		else
		{
//			previous.next = current.next;
			previous.setNext(current.getNext());
		}
		
			
			
	}
	
	void view()
	{
		Shape current = start;
		
		while(current != null)
		{
			current.draw();
			current = current.getNext();
		}
	}
}















