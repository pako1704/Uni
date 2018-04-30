package uebung05;

import javax.swing.JOptionPane;

public class FlaechengleicherKreis {
	public static void main(String[] args) {

		double l, b, radius;
		String laenge, breite;
		laenge = JOptionPane.showInputDialog("Geben Sie bitte eine Zahl f�r die L�nge ein: ");
		breite = JOptionPane.showInputDialog("Nun bitte eine Zahl f�r die Breite: ");

		l = Double.parseDouble(laenge);
		b = Double.parseDouble(breite);
		radius = Math.sqrt((l * b) / Math.PI);
		
		Kreis k = new Kreis(radius);
		Rechteck r = new Rechteck(l, b);

		System.out.println("Rechteckl�nge: " + r.getLaenge() + " LE");
		System.out.println("Rechteckbreite: " + r.getBreite() + " LE");
		System.out.println("Rechteckfl�che: " + r.getFlaeche() + " LE\u00b2");
		System.out.println("Kreisradius: " + radius + " LE");
		System.out.println("Kreisfl�che: " + k.getFlaeche() + " LE\u00b2");
	}
}
