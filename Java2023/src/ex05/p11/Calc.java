package ex05.p11;

public abstract class Calc 
{
	protected int a;
	protected int b;
	void setValue(int a, int b)
	{
		this.a = a;
		this.b = b;
	}
	
	abstract int calculate();
}

class Add extends Calc{
	@Override
	int calculate() {
		return a+b;
	}
}

class Sub extends Calc{
	@Override
	int calculate() {
		return a-b;
	}
}

class Mult extends Calc{
	@Override
	int calculate() {
		return a*b;
	}
}

class Div extends Calc{
	@Override
	int calculate() 
	{
		return a/b;
	}
}







