package uebung06;

public class Bruch {
	int zaehler;
	int nenner;

	Bruch() {
		zaehler = 0;
		nenner = 1;
	}

	Bruch(int x) {
		zaehler = x;
		nenner = 1;
	}

	Bruch(int x, int y) {
		zaehler = x;
		nenner = y;
	}

	int getZaehler() {
		return zaehler;
	}

	int getNenner() {
		return nenner;
	}

	void setZaehler(int z) {
		zaehler = z;
	}

	void setNenner(int n) {
		nenner = n;
	}

	void ausgeben() {
		System.out.print(zaehler + "/" + nenner);
	}

	String bruchToString() {
		return zaehler + "/" + nenner;
	}

	void kuerzen() {
		int m, n, r; // lokale Variablen
		m = Math.abs(zaehler); // speichert in m den Betrag von zaehler
		n = Math.abs(nenner); // speichert in n den Betrag von nenner
		r = m % n;
		while (r > 0) {
			m = n;
			n = r;
			r = m % n;
		}
		zaehler /= n; // in n steht jetzt der ggT
		nenner /= n;
	}

	void gekuerztausgeben() {
		kuerzen();
		ausgeben();
	}

	boolean equals(Bruch x) {
		Bruch a = new Bruch(this.zaehler, this.nenner);
		Bruch b = new Bruch(x.zaehler, x.nenner);
		a.kuerzen();
		b.kuerzen();
		if ((a.zaehler == b.zaehler) && (a.nenner == b.nenner)) {
			return true;
		} else {
			return false;
		}
	}

	Bruch addiere(Bruch b) {
		int z = b.zaehler * nenner + b.nenner * zaehler;
		int n = b.nenner * nenner;
		Bruch summe = new Bruch(z, n);
		return summe;

	}

	Bruch subtrahiere(Bruch b) {
		int z = b.nenner * zaehler - b.zaehler * nenner;
		int n = b.nenner * nenner;
		Bruch differenz = new Bruch(z, n);
		return differenz;
	}
	
	double dezimalwert() {
		return zaehler / nenner;
	}

}