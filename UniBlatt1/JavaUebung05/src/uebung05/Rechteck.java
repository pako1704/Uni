package uebung05;

public class Rechteck {
	double laenge, breite;

	public Rechteck() {
		laenge = 0;
		breite = 0;
	}

	public Rechteck(double l, double b) {
		this.laenge = l;
		this.breite = b;
	}

	public double getLaenge() {
		return this.laenge;
	}

	public void setLaenge(double l) {
		this.laenge = l;
	}

	public double getBreite() {
		return this.breite;
	}

	public void setBreite(double b) {
		this.breite = b;
	}

	public void setSeiten(double l, double b) {
		this.laenge = l;
		this.breite = b;
	}

	public double getLangeSeite() {
		if (laenge > breite) {
			return laenge;
		} else {
			return breite;
		}
	}

	public double getKurzeSeite() {
		if (laenge < breite) {
			return laenge;
		} else {
			return breite;
		}
	}

	public double getDiagonale() {
		return Math.sqrt(laenge * laenge + breite * breite);
	}

	public double getFlaeche() {
		return laenge * breite;
	}

	public double getUmfang() {
		return 2 * laenge + 2 * breite;
	}

	public void laengeAusgeben() {
		double laenge = 5.4;
		System.out.println("Länge: " + laenge + " LE");
	}

	public void laengeVergroessern(double l) {
		double laenge = l + 1.356767;
		System.out.println("Vergrösserte Länge: " + laenge + " LE");
	}

	public void breiteVergroessern(double b) {
		double breite = b + 2.8877954;
		System.out.println("Vergrösserte Breite: " + breite + " LE");

	}

	public void laengeVerkleinern(double l) {
		double laenge = l - 3.987654321;
		System.out.println("Verkleinerte Länge: " + laenge + " LE");
	}

	public void breiteVerkleinern(double b) {
		double breite = b - 1.64738;
		System.out.println("Verkleinerte Breite: " + breite + " LE");

	}
}
