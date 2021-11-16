package firma;

public interface Visitor {
	public void visitFirma(Firma f);
	public void visitDirector(Director d);
	public void visitManager(Manager m);
	public void visitAngajat(Angajat a);
	public void visitSalariu(Salariu s);
	public void visitSalariuProxi(SalariuProxy s);

}
