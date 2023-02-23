package ex04.p09;

public class ArrayUtil 
{
	public static int [] concat(int[] a, int[] b) 
	{
		int c[] = new int[a.length+b.length];
		
		for(int i=0; i<a.length;++i)
			c[i] = a[i];
		
		for(int i=0; i<b.length;++i) 
		{
			int idx = a.length+i;
			c[idx] = b[i];
		}
		return c;
	}
	
	public static void print(int[] a) 
	{
		System.out.print("[");
		for(int i=0; i<a.length;++i)
		{
			System.out.print(a[i] +" ");
		}
		System.out.print("]");
	}
}


