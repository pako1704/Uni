package uebung05;

import javax.swing.JOptionPane;

public class Kreistabelle {
	public static void main(String[] args) {
		String radius, erhoehung;
		double r;
		int erhoe;

		radius = JOptionPane.showInputDialog("Geben Sie bitte einen Radius an: ");
		erhoehung = JOptionPane
		        .showInputDialog("Und bitte eine ganze Zahl, um die der Radius jeweils 30 mal erhöht werden soll: ");

		r = Double.parseDouble(radius);
		erhoe = Integer.parseInt(erhoehung);

		Kreis tabelle = new Kreis(r);
		System.out.println("Radius:\t\t\t\tUmfang:\t\t\t\t\tFläche:");
		for(int i = 0; i < 30; i++){
			tabelle.setRadius(r + i * erhoe);
			System.out.println(tabelle.getRadius() + " \t\t\t\t" + tabelle.getUmfang() + " \t\t\t" + tabelle.getFlaeche());
			
		}
	}
}
