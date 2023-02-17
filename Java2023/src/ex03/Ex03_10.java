package ex03;

public class Ex03_10 {

	public static void main(String[] args) 
	{
		int arr1[][] = new int[4][4];
		
		for(int i=0;i<arr1.length;++i)
			for(int j=0;j<arr1[i].length;++j)
				arr1[i][j]= 0;
		
		
		int n=0;
		while(n<10)
		{
			int i = (int)(Math.random()*4);
			int j = (int)(Math.random()*4);
			
			if(arr1[i][j] != 0)
				continue;
			
			arr1[i][j]= (int)(Math.random()*10+1);
			n++;
		}
		
		
		for(int i=0;i<arr1.length;++i) {
			for(int j=0;j<arr1[i].length;++j) {
				System.out.print(arr1[i][j]+" ");
			}
			System.out.println();
		}

	}

}
