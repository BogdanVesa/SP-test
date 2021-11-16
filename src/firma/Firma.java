package firma;

import java.util.ArrayList;
import java.util.List;

public class Firma implements Personal, Visitee{
	String nume;
	List<Personal> personal = new ArrayList<Personal>();

	public Firma(String nume) {
		super();
		this.nume = nume;
	}
	
	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println(this.nume);
		this.personal.forEach(personal ->{
			personal.print();
		});
	}
	
	public void add(Personal p) {
		this.personal.add(p);
	}
	
	public void remove(Personal p) {
		this.personal.remove(p);
	}
	
	public Personal get(int i) {
		return this.personal.get(i);
	}

	@Override
	public void accept(Visitor visitor) {
		// TODO Auto-generated method stub
		visitor.visitFirma(this);
	}

	
}
