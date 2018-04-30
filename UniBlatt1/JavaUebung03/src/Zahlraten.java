import javax.swing.JOptionPane;

public class Zahlraten {
	public static void main(String[] args){
		String eingabe;
		int zahl;
		eingabe = JOptionPane.showInputDialog("Geben Sie bitte eine Zahl von 0 - 9 ein: ");
		zahl = Integer.parseInt(eingabe); //wichtig zu merken habe ich nicht von mir aus gewusst
		switch(zahl){
		case 1:
		case 2:
		case 3:
		case 4:
		case 5:
		case 7:
		case 8:
		case 9:
		case 0:
			JOptionPane.showMessageDialog(null, eingabe + " war nicht die gewünschte Zahl.");
			break;
			default:
				JOptionPane.showMessageDialog(null, zahl + " war die gewünschte Zahl, Glückwunsch!!!");
			
		}
	}
}
