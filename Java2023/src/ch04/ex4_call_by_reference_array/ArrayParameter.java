package ch04.ex4_call_by_reference_array;

public class ArrayParameter 
{
	static int a1;
	
	static void setA1(int a)
	{
		a1 = a;
	}
	
	static void replaceSpace(char a[]) {
		for (int i = 0; i < a.length; i++)
			if (a[i] == ' ')
				a[i] = ',';
	}
	static void printCharArray(char a[]) {
		for (int i = 0; i < a.length; i++)
			System.out.print(a[i]);
		System.out.println();
	}
}
