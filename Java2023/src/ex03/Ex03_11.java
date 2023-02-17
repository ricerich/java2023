package ex03;

public class Ex03_11 {

	public static void main(String[] args) 
	{
		int sum=0;
		for(int i=0;i<args.length;++i)
			sum = sum + Integer.parseInt(args[i]);
		
		System.out.println("합계는 " + sum);
	}
}
