package uebung06;

public class Kreis extends TeilMitRundung {
	public Kreis(double r) {
		radius = r;
	}

	public double getUmfang() {
		return 2 * Math.PI * radius;
	}

	public double getFlaeche() {
		return Math.PI * radius * radius;
	}
}
