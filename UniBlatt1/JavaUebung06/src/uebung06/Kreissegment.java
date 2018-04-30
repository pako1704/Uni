package uebung06;

public class Kreissegment extends TeilMitRundung {
	public double winkel;
	public Kreissegment(){
		super();
		winkel = 90;
	}
	public Kreissegment(double r, double w){
		super(r);
		winkel = w;
	}
	public double getFlaeche(){
		return Math.PI * radius * radius * winkel/360;
	}
	public double getUmfang(){
		return 2 * Math.PI * radius * winkel/360 + 2 * radius;
	}
}
