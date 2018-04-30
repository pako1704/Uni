package uebung05;

import javax.swing.JOptionPane;

public class Rechtecktest {
	public static void main(String[] args){
		double zahl1, zahl2;
		String laenge, breite;
		
		laenge = JOptionPane.showInputDialog("Bitte geben Sie eine Zahl für die Länge ein: ");
		breite = JOptionPane.showInputDialog("Bitte geben Sie eine Zahl für die Breite ein: ");
		
		zahl1 = Double.parseDouble(laenge);
		zahl2 = Double.parseDouble(breite);
		
		Rechteck rechteck = new Rechteck(zahl1, zahl2);
		
		System.out.println("Lange Seite: " + rechteck.getLangeSeite() + " LE");
		System.out.println("Kurze Seite: " + rechteck.getKurzeSeite() + " LE");
		System.out.println("Diagonale: " + rechteck.getDiagonale() + " LE");
		System.out.println("Fläche: " + rechteck.getFlaeche() + " LE" + '\u00b2');
		System.out.println("Umfang: " + rechteck.getUmfang() + " LE");
		
		rechteck.laengeAusgeben();
		rechteck.laengeVergroessern(zahl1);
		rechteck.laengeVerkleinern(zahl1);
		rechteck.breiteVergroessern(zahl2);		
		rechteck.breiteVerkleinern(zahl2);
	}
}
