/*Berechnung der Diskriminanten einer quadratischen Funktion
 * 
 */
import javax.swing.JOptionPane;

public class QuadratischeFunktionDiskriminatnte {
	public static void main(String[] args){
		int a,b,c,d;
		String a1, b1, c1;
		a1 = JOptionPane.showInputDialog("Geben Sie bitte eine ganze Zahlen für A ein:");
		b1 = JOptionPane.showInputDialog("Geben Sie bitte eine ganze Zahlen für B ein:");
		c1 = JOptionPane.showInputDialog("Geben Sie bitte eine ganze Zahlen für C ein:");


		a = Integer.parseInt(a1);
		b = Integer.parseInt(b1);
		c = Integer.parseInt(c1);
		d = b * b - 4 * a * c;
		if(d == 0){
			JOptionPane.showMessageDialog(null, "Es gibt genau EINE Lösung!!!!!!!!!!");
		}else{
			if(d > 0){
				JOptionPane.showMessageDialog(null, "Es gibt ZWEI Lösungen!!!!!!!!");
			}else{
				if(d < 0){
					JOptionPane.showMessageDialog(null, "Es gibt GAR KEINE Lösung!!!!!!!");
				}
			}
		}
	}
}
