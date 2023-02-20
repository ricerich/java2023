package ex03;

import java.util.Scanner;

public class Ex03_14 {

	public static void main(String[] args) 
	{
		String course [ ] = {"Java", "C++", "HTML5", "컴퓨터 구조", "안드로이드"};
		int score [ ] = {95, 88, 76, 62, 55};
		
		Scanner sc1 = new Scanner(System.in);
		
		while(true)
		{
			System.out.print("과목명>>");
			String name = sc1.next();
			
//			if(name == "그만")//String 이게 안됨!
			if(name.equals("그만"))
			{
				System.out.println("끝났습니다!");
				break;
			}
			
//			int index=0;
			int i;
			for(i=0; i<course.length; ++i)
			{				
				if(name.equals(course[i])) {
					System.out.println(name + "의 점수는" + score[i]);
					break;
				}
				//index = i+1;
			}
			
			if(i==score.length)
				System.out.println("없는 과목입니다");
		}
	}

}
