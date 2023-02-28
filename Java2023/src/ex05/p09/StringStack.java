package ex05.p09;

public class StringStack implements Stack {

	String element[];
	private int top;
	
	public StringStack(int capacity) {
		element = new String[capacity];
		top = -1;
	}

	@Override
	public int length() {
		return top+1;
	}

	@Override
	public int capacity() {
		return element.length;
	}

	@Override
	public boolean push(String val) {
		
		if(top == element.length-1)
			return false;
		else
		{
			top++;
			element[top] = val;
			return true;
		}
		
	}
	
	@Override
	public String pop() 
	{
		if(top == -1)
			return null;
		
		String str1 = element[top];
		top--;
					
		return str1;
	}

}
