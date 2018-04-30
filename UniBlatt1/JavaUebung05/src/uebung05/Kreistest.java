package uebung05;

import javax.swing.JOptionPane;

public class Kreistest {

	public static void main(String[] args) {
		String kreisradius, einheit;
		double zahl;
		
		kreisradius = JOptionPane.showInputDialog("Geben Sie bitte einen Kreisradius an: ");
		einheit = JOptionPane.showInputDialog("Geben sie bitte eine Einheit an: ");
		zahl = Double.parseDouble(kreisradius);
		Kreis k1 = new Kreis(zahl);
		System.out.println("Radius: " + k1.getRadius() + " " + einheit);
		System.out.println("Umfang: " + k1.getUmfang() + " " + einheit);
		System.out.println("Fläche: " + k1.getFlaeche() + " " + einheit + '\u00b2');


	}
}
