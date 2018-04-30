package Einfuehrung01;

//import javax.swing.JOptionPane;
//0,1,1,2,3,5,8,13,21,34,55
public class FibonacciZahlen {
  public static void main(String[] args) {
    int n = 3;
//    String eingabe;
//    eingabe = JOptionPane.showInputDialog("Zahl eingeben: ");
//    n = Integer.parseInt(eingabe);
    int result = Fiobonacci(n);
    if (n > 0) {
      System.out.println("Die " + n + ". Fibonacci-Zahl ist: " + result);
    } else {
      System.out.println("Fehler, geben Sie nächstes Mal bitte eine Zahl größer oder gleich 0 ein!");
    }
  }

  public static int Fiobonacci(int n) {
    if (n == 0) {
      return 0;
    } else if (n == 1) {
      return 1;
    } else if (n > 1) {
      return ((n - 1) + (n - 2));
    } else if(n > 4){
      return((n-1) + (n-1));
    }
    return n;
  }

}