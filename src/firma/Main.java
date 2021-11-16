package firma;

public class Main {

	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();
		Firma firma = new Firma("Test");
		Director director =new Director("Andrei","Director");
		Manager manager = new Manager("Cristi","Manager");
		Angajat angajat = new Angajat("Paul","Angajat");
		Salariu sal1 = new Salariu("director", 6800);
		Salariu sal2 = new Salariu("manager", 5000);
		Salariu sal3 = new Salariu("director", 3000);
		
		firma.add(director);
		firma.add(manager);
		firma.add(angajat);
		firma.add(sal1);
		firma.add(sal2);
		firma.add(sal3);
		
		long endTime = System.currentTimeMillis();
		System.out.println("Crearea salariului a durat " + (endTime - startTime) + " millisecunde");
		
		firma.print();
		
		FirmaStatistics stats = new FirmaStatistics();
		
		firma.accept(stats);
		stats.print();
	}

}
