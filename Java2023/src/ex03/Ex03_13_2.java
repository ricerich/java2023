package ex03;

public class Ex03_13_2 {

	public static void main(String[] args) 
	{
		String str1[] = {"박수 짝","박수 짝짝"};
		
		int cnt = 0;
		for(int i=1; i<=99; i++)
		{
			int n=i;
			for(int j=n%10;n>0;j=n%10) {
				if(j==3 || j==6 || j==9)
					cnt++; 
					n = n / 10;
			}
			
			if(cnt>0)
				System.out.println(i+str1[cnt-1]);
			
			cnt = 0;
		}
	}
}
