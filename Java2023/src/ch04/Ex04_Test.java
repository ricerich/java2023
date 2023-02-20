package ch04;

public class Ex04_Test {

	public static void main(String[] args) 
	{
//		PersonApp pa1 = new PersonApp();
//		new PersonApp().run();
		
		//여기서 부터
		Person p1;//객체 변수(미생), 레퍼런스 
		p1 = new Person();//p1이 객체가 된다.1)객체만들기
		
		//2.생성자 사용, 반드시 new와 함께
		Person p2 = new Person();//클래스 사용하여, 객체 만들기
		
		//1.멤버변수 사용 - 직접 접근 하는거 비추!
//		p1.name = "강감찬";
//		p1.age = 55;
//		p1.height = 194.7f;
		
		p1.setName("강감찬");
		p1.setAge(55);
		p1.setHeight(194.7f);
		
//		p1.modifyAge();//private라 안보임
		p1.printPerson();
		
		System.out.println(p1.getHeight()+" cm "+p1.getName()+"의 나이는 "+p1.getAge()+"입니다");
		
		//3.메소드 사용
		p1.setAge(45);
//		System.out.println(p1.height+" cm "+p1.name+"의 나이는 "+p1.age+"입니다");
		System.out.println(p1.getHeight()+" cm "+p1.getName()+"의 나이는 "+p1.getAge()+"입니다");

		p1.addAge(3);
		System.out.println(p1.getHeight()+" cm "+p1.getName()+"의 나이는 "+p1.getAge()+"입니다");
		
		//p2
		p2.addAge();
		System.out.println(p2.getHeight()+" cm "+p2.getName()+"의 나이는 "+p2.getAge()+"입니다");
		
		p2.addAge(15, "홍자");
		System.out.println(p2.getHeight()+" cm "+p2.getName()+"의 나이는 "+p2.getAge()+"입니다");
		
		p2.addAge(5.3f);
		System.out.println(p2.getHeight()+" cm "+p2.getName()+"의 나이는 "+p2.getAge()+"입니다");
		
	}

}





