package ch04.ex2;

public class MyExp 
{
	int base;
	int exp;
	
	public MyExp()
	{
		
	}
	
	public MyExp(int base, int exp) 
	{
		this.base = base;
		this.exp = exp;
	}

	int getValue() {
		int res=1;
		for(int i=0; i<exp; i++)
			res = res * base;
		return res;
	}

	public void setBase(int base1) {
		base = base1;
	}

	public void setExp(int exp) {
		this.exp = exp;
	}

	public int getBase() {
		return base;
	}

	public int getExp() {
		return exp;
	}
	
	
}
