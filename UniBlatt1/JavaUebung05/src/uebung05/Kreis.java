package uebung05;

public class Kreis {
	double radius;
	public Kreis(){
		radius = 0;
	}
	public Kreis(double r){
		this.radius = r;		
	}
	public double getRadius(){
		return this.radius;
	}
	public void setRadius(double r){
		this.radius = r;
	}
	public double getUmfang(){
		return 2 * Math.PI * radius;
	}
	public void setUmfang(double u){
		this.radius = u / (2 * Math.PI);
	}
	public double getFlaeche(){
		return Math.PI * radius * radius;
	}
	public void setFlaeche(double f){
		this.radius = Math.sqrt(getFlaeche() / Math.PI);
	}
}
	
