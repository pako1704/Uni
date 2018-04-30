package uebung07;

import javax.swing.JOptionPane;

public class Stringrueckwaerts {
	public static void main(String[] args){
		String eingabe;
		eingabe = JOptionPane.showInputDialog("Geben Sie bitte eine Wortkette ein, die reverst werden soll: ");
		
		for(int i = eingabe.length() - 1; i >= 0; i--){
			System.out.print(eingabe.charAt(i));
		}
	}

}
