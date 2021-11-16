package firma;

public class Angajat implements Personal,Visitee {
	String nume;
	String functie;
	
	public Angajat(String nume, String functie) {
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
		visitor.visitAngajat(this);
	}
	
	
}
