package firma;

public class Director implements Personal, Visitee{
	String nume;
	String functie;
	
	
	public Director(String nume, String functie) {
		super();
		this.nume = nume;
		this.functie = functie;
	}


	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println(this.nume+" "+this.functie);
	}


	@Override
	public void accept(Visitor visitor) {
		// TODO Auto-generated method stub
		visitor.visitDirector(this);
	}
}
