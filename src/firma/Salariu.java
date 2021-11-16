package firma;

import java.util.concurrent.TimeUnit;

public class Salariu implements SumSalariu, Personal, Visitee {
	String functie;
	double lei;
	
	
	public Salariu(String functie, double lei) {
		this.functie = functie;
		if(lei < 6400) {
			try {
		    	TimeUnit.SECONDS.sleep(5);
		    	} catch (InterruptedException e) {
		    	e.printStackTrace();
		    	}	
		}
		this.lei = lei;	
	}


	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println(this.functie+" "+this.lei);
	}


	@Override
	public void accept(Visitor visitor) {
		// TODO Auto-generated method stub
		visitor.visitSalariu(this);
	}
	
	
}
