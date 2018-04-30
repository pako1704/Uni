package Aufgabe1;
import javax.swing.JOptionPane;;

public class MainClassAusgabe {
  public static void main(String[] args) {
    
    String eingabe1;
    String eingabe2;
    float netto;
    double steuersatz;
    double mwst;
    eingabe1 = JOptionPane.showInputDialog("Geben Sie bitte Ihr momentanes Nettoeinkommen ein:");
    eingabe2 = JOptionPane.showInputDialog("Geben Sie bitte eine ganze Zahl als Steuersatz an:");
    netto = Float.parseFloat(eingabe1);   
    steuersatz = Integer.parseInt(eingabe2);
    mwst = 1 + steuersatz / 100 ;
    float brutto = (float)(int) (netto * mwst);
    System.out.println(brutto);
  }
}
