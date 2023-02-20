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
	}
	
	//3.메소드
	void addAge(int a)
	{
		age = age + a;
	}
	
	void setAge(int age1)
	{
		age = age1;
	}
	
	String getName()
	{
		return name;
	}
	
	int getAge()
	{
		return age;
	}
	
	float getHeight()
	{
		return height;
	}

}







