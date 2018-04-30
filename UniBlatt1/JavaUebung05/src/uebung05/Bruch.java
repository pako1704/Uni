package uebung05;

public class Bruch {
	int zaehler;
	int nenner;

	public Bruch(int z, int n) {
		zaehler = z;
		nenner = n;
	}

	public void ausgeben() {
		int zaehler = 0; // namensgleiche lokale Variable
		System.out.println(this.zaehler + "/" + nenner);
	}

	public void kuerzen() {
		int m, n, r; // lokale Variablen
		m = zaehler;
		n = nenner;
		r = m % n;
		while (r > 0) {
			m = n;
			n = r;
			r = m % n;
		}
		zaehler = zaehler / n; // in n steht jetzt der ggT
		nenner = nenner / n;
	}

	public void gekuerztausgeben() {
		kuerzen();
		ausgeben();
	}

	public void erweitern(int a) { // Referenztypen als Parameter
		zaehler *= a;
		nenner *= a;
	}

	public void multiplikation(Bruch m) {
		zaehler *= m.zaehler;
		nenner *= m.nenner;
	}

	public boolean equals(Bruch x) {
		if (x == null) {
			return false;
		} else {
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
	}

}
