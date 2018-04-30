
/*Prüfen, ob Jahreszahl Schaltjahr ist oder nicht.
 */

import javax.swing.JOptionPane;

public class Schaltjahr {
  public static void main(String[] args) {
    int jahreszahl;
    String eingabe;
    eingabe = JOptionPane.showInputDialog("Geben Sie bitte eine vierstellige ganze Zahl ein:");

    jahreszahl = Integer.parseInt(eingabe);
    if (jahreszahl % 4 != 0) {
      JOptionPane.showMessageDialog(null, "Das Jahr " + eingabe + " ist kein Schaltjahr!");
    } else {

      if (jahreszahl % 100 == 0) {
        if (jahreszahl % 400 == 0) {
          JOptionPane.showMessageDialog(null, "Das Jahr " + eingabe + " ist Schaltjahr!");
        } else {
          JOptionPane.showMessageDialog(null, "Das Jahr " + eingabe + " ist kein Schaltjahr!");
        }
      } else {
        JOptionPane.showMessageDialog(null, "Das Jahr " + eingabe + " ist Schaltjahr!");
      }
    }

  }

}
