package ex03;

public class Ex03_09 {

	public static void main(String[] args)
	{
		int arr1[][] = new int[4][4];
		
		for(int i=0;i<arr1.length;++i)
			for(int j=0;j<arr1[i].length;++j)
				arr1[i][j]= (int)(Math.random()*10+1);
		
		for(int i=0;i<arr1.length;++i) {
			for(int j=0;j<arr1[i].length;++j) {
				System.out.print(arr1[i][j]+" ");
			}
			System.out.println();
		}

	}

}
