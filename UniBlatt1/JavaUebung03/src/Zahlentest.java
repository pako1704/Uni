/*
 * 
 */
import javax.swing.JOptionPane; 

public class Zahlentest {
	public static void main(String[] args){
	double zahl;
	String eingabe;
	eingabe = JOptionPane.showInputDialog("Geben Sie bitte eine positive oder negative Kommazahl ein:");
	zahl = Double.parseDouble(eingabe);
	if(zahl < 0){
		JOptionPane.showMessageDialog(null, "Die von Ihnen eingegebene Zahl ist negativ!");
	}else{
		JOptionPane.showMessageDialog(null, "Die Zahl ist positive!!!");
	}
	
	
	}
}
