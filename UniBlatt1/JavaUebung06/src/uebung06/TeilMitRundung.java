package uebung06;

public class TeilMitRundung {
	double radius;

	public TeilMitRundung() {
		radius = 1;
	}

	TeilMitRundung(double r) {
		radius = r;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double r) {
		radius = r;
	}

	public void radiusVergroessernUm(double vr) {
		radius = radius + vr;
	}
}
