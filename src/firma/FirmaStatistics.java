package firma;


public class FirmaStatistics implements Visitor {
	int countDirector = 0;
	int countManager = 0;
	int countAngajat = 0;
	
	public FirmaStatistics() {
		
	}
	
	public void print() {
		System.out.println("Director "+countDirector);
		System.out.println("Manager "+countManager);
		System.out.println("Angajat "+countAngajat);
	}

	@Override
	public void visitFirma(Firma f) {
		// TODO Auto-generated method stub
		for (Personal e : f.personal){
            ((Visitee) e).accept(this);
        }
	}

	@Override
	public void visitDirector(Director d) {
		// TODO Auto-generated method stub
		countDirector++;
	}

	@Override
	public void visitManager(Manager m) {
		// TODO Auto-generated method stub
		countManager++;
	}

	@Override
	public void visitAngajat(Angajat a) {
		// TODO Auto-generated method stub
		countAngajat++;
	}

	@Override
	public void visitSalariu(Salariu s) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visitSalariuProxi(SalariuProxy s) {
		// TODO Auto-generated method stub
		
	}
	

}
