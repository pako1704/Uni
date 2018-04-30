import javax.swing.JOptionPane;

public class ggTEuklid {
	public static void main(String[] args){
		int m, n, r;
		
		String eingabe;
		eingabe = JOptionPane.showInputDialog("Geben Sie bitte eine ganze Zahl für m ein: ");
		m = Integer.parseInt(eingabe);
		System.out.println("m = " + m);
		
		eingabe = JOptionPane.showInputDialog("Geben Sie bitte eine ganze Zahl für n ein: ");
		n = Integer.parseInt(eingabe);
		System.out.println("n = " + n);
		r = m % n;
		while(r > 0) {
			m= n;
			n= r;
			r= m%n;
			
		}
		System.out.println("ggT = " + n);
	}

}
