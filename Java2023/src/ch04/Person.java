package ch04;

//class Animal{
//	
//}

public class Person
{
	//클래스의 구성요소
	//1.멤버변수(member variable, field)
	//2.생성자(Constructor)
	//3.(멤버)메소드(method)
	//4.내부 클래스(inner class)
	
	//1.멤버변수 만들기
	private String name;
	private int age;
	private float height;
	
	//2.생성자 (메소드) 만들기
	public Person()
	{
		name = "홍길동";
		age = 20;
		height = 150.5f;
		
//		printPerson();
	}
	
	//3.메소드
	
	//modifyAge();//안됨! 클래스 땅
	
	private void modifyAge()
	{
		age=age-2;
	}
	
	public void addAge()
	{
		age++;
	}
		
	public void addAge(int plus)
	{
		age = age + plus;
	}
	
	public void addAge(float plus)
	{
		age++;
		height = height + plus;
		
	}
	
	public void addAge(int plus, String nickname)
	{
		age = age + plus;
		System.out.println(nickname);
	}
	
	
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public void setAge(int age1)
	{
		age = age1;
		modifyAge();
	}
	
	public void setHeight(float height1)
	{
		height = height1;
	}
	
	
	public String getName()
	{
		return name;
	}
	
	public int getAge()
	{
		modifyAge();
		return age;
	}
	
	public float getHeight()
	{
		return height;
	}
	
	//출력용 메소드
	public void printPerson()
	{
		System.out.println(name+"의 나이는 "+age+"입니다");
	}

}







