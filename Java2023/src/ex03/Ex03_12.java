package ex03;

public class Ex03_12 {

	public static void main(String[] args) 
	{
		int sum=0;
		for(int i=0;i<args.length;++i)
		{
			try {
				sum = sum + Integer.parseInt(args[i]);
			}
			catch(Exception e)
			{
				
			}
		}
		
		System.out.println("합계는 " + sum);
	}

}
