/*Vokaltest mit switch - case
 * Nach der Eingabe eines Zeichens wird geprüft,
 * ob es sich um einen Vokal handelt.
 * Das Ergebnis wird in einem MessageDialog ausgegeben. 
 */

import javax.swing.JOptionPane;

public class VokaltestSwitchCase {
	public static void main (String[] args){
		String eingabe;
		char c;
		eingabe = JOptionPane.showInputDialog("Geben Sie einen Buchstaben ein: ");
		c = eingabe.charAt(0);
		switch(c) { //nur char, byte, short, int hinter switch möglich
		case 'a': //kein break; fallthrough erwünscht
		case 'e': //kein break; fallthrough erwünscht
		case 'i': //kein break; fallthrough erwünscht
		case 'o': //kein break; fallthrough erwünscht
		case 'u':
		case 'A':
		case 'E':
		case 'I':
		case 'O':
		case 'U':
			JOptionPane.showMessageDialog(null, c + " ist ein Vokal");
			 break;
			default:
				JOptionPane.showMessageDialog(null, c + " ist kein Vokal");
		}
	}
}
