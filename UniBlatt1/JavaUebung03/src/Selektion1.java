/*Java-Programm mit if-Anweisung 
 */
import javax.swing.JOptionPane;

public class Selektion1 {
	public static void main(String[] args) {
		int alter;
		String eingabe;
		eingabe = JOptionPane.showInputDialog("Gebe bitte dein Alter ein: ");
		alter = Integer.parseInt(eingabe);
		if(alter < 18){
			JOptionPane.showMessageDialog(null, "Es tut mir leid, du bist noch nicht volljährig!");
		}else{
			JOptionPane.showMessageDialog(null, "Herzlichen Glückwunsch, du bist volljährig!");
		}
	}

}
