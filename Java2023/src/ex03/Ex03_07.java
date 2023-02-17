package ex03;

public class Ex03_07 {

	public static void main(String[] args) 
	{
		int nArray[] = new int[10];
		
		for(int i=0;i<nArray.length;++i)
			nArray[i] = (int)(Math.random()*10+1);
		
		int sum=0;
		for(int i=0;i<nArray.length;++i)
			sum = sum + nArray[i];
		
		System.out.print("랜덤 정수: ");
		for(int i=0;i<nArray.length;++i)
			System.out.print(nArray[i]+" ");

	}

}
