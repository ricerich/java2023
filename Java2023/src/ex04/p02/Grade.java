package ex04.p02;

public class Grade {

	private int math;
	private int science;
	private int english;

	public Grade(int math, int science, int english) 
	{
		this.math = math;
		this.science = science;
		this.english = english;
	}

	public int average() {
		int result = (math+science+english)/3;
		return result;
	}

}
