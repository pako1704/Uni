package uebung07;

import javax.swing.JOptionPane;

public class Vokalzaehler {
	public static void main(String[] args) {
		String eingabe;
		int azaehler = 0, ezaehler = 0, izaehler = 0, ozaehler = 0, uzaehler = 0, leerzaehler = 0;
		eingabe = JOptionPane.showInputDialog("Geben Sie bitte einen lange Wort ein: ");
		String eingabe2 = eingabe.toLowerCase();
		for (int i = 0; i < eingabe2.length(); i++) {
			switch (eingabe2.charAt(i)) {
			case 'a':
				azaehler++;
				break;
			case 'e':
				ezaehler++;
				break;
			case 'i':
				izaehler++;
				break;
			case 'o':
				ozaehler++;
				break;
			case 'u':
				uzaehler++;
				break;
			case ' ':
				leerzaehler++;
				break;
			}
		}
		System.out.println("Die Eingabe \"" + eingabe2 + "\" enthält:");
		System.out.println(azaehler + " mal a");
		System.out.println(ezaehler + " mal e");
		System.out.println(izaehler + " mal i");
		System.out.println(ozaehler + " mal o");
		System.out.println(uzaehler + " mal u");
		System.out.println(leerzaehler + " Leerzeichen");
	}

}
