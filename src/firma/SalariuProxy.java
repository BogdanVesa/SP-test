package firma;


public class SalariuProxy implements SumSalariu, Personal, Visitee{
	String functie;
	double lei;
	Salariu realSal;
	
	
	public SalariuProxy(String functie, double lei) {
		super();
		this.functie = functie;
		this.lei = lei;
	}
	
	Salariu loadImage() {
		if(realSal == null) {
			realSal = new Salariu(functie, lei);
		}
		return realSal;
	}

	@Override
	public void accept(Visitor visitor) {
		// TODO Auto-generated method stub
		visitor.visitSalariuProxi(this);
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println(this.functie+" "+this.lei);
	}
}
