
public class Kreisberechnung {

	private double radius = 5;
	private double umfang;
	private double flaeche;

	public double getRadius() {
		return radius;
	}

	public double getUmfang() {
		this.umfang = 2 * Math.PI * radius;
		return umfang;
	}

	public double getFlaeche() {
		this.flaeche = Math.PI * radius * radius;
		return flaeche;
	}
}
