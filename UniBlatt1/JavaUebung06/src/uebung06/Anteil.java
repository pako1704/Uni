package uebung06;

public class Anteil extends Bruch {
	static Bruch verteilt = new Bruch(0);

	Anteil() {
		super();
	}

	Anteil(int z, int n){
		super(z,n);
		verteilt = verteilt.addiere(this);
		if(this.getVerteilt() > 1)
			System.out.println("Fehler!");
	}
	
	double getVerteilt(){
		
		return (double) verteilt.zaehler / verteilt.nenner;
	}
	
	Bruch getRest(){
		Bruch gesamt = new Bruch(1);
		return gesamt.subtrahiere(verteilt);
	}

}
