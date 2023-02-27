package ex05.p03;

public class Won2Dollar extends Converter {

	public Won2Dollar(int ratio) {
		this.ratio = ratio; 
	}

	@Override
	protected double convert(double src) {
//		double won = dollar/ratio;
		return src/ratio;
	}

	@Override
	protected String srcString() {
		return "원";
	}

	@Override
	protected String destString() {
		return "달러";
	}

}
