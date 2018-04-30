package rekursionuebungen;

import javax.swing.JOptionPane;

public class ggT {
	public static void main(String[] args) {

		String eingabe1, eingabe2;
		long zahl1, zahl2;
		eingabe1 = JOptionPane.showInputDialog("Geben Sie bitte eine erste ganze Zahl ein: ");
		eingabe2 = JOptionPane.showInputDialog("Geben Sie bitte eine zweite ganze Zahl ein: ");
		zahl1 = Long.parseLong(eingabe1);
		zahl2 = Long.parseLong(eingabe2);

		if (zahl1 % zahl2 == 0) {
			System.out.println(zahl2 + " ist größter gemeinsamer Teiler!");
		}else{
			if (zahl2 % (zahl1 % zahl2) == 0) 
			System.out.println(zahl1 % zahl2 + " ist ggT!");
			if((zahl1 % zahl2) % (zahl2 % (zahl1 % zahl2)) == 0){
				System.out.println(zahl2 % (zahl1 % zahl2) + " ist ggT!");
			}else{
				if((zahl2 % (zahl1 % zahl2)) % ((zahl1 % zahl2) % (zahl2 % (zahl1 % zahl2))) == 0 ){
					System.out.println(((zahl1 % zahl2) % (zahl2 % (zahl1 % zahl2))) + " ist ggT!");
				}else{
					if(((zahl1 % zahl2) % (zahl2 % (zahl1 % zahl2))) % 
							(zahl2 % (zahl1 % zahl2)) % ((zahl1 % zahl2) % (zahl2 % (zahl1 % zahl2))) == 0){
						System.out.println((zahl2 % (zahl1 % zahl2)) % ((zahl1 % zahl2) % (zahl2 % (zahl1 % zahl2))) + " ist ggT!");						
					}else{
						if((zahl2 % (zahl1 % zahl2)) % ((zahl1 % zahl2) % (zahl2 % (zahl1 % zahl2))) %
								((zahl1 % zahl2) % (zahl2 % (zahl1 % zahl2))) % 
								(zahl2 % (zahl1 % zahl2)) % ((zahl1 % zahl2) % (zahl2 % (zahl1 % zahl2))) == 0){
							System.out.println(((zahl1 % zahl2) % (zahl2 % (zahl1 % zahl2))) % 
									(zahl2 % (zahl1 % zahl2)) % ((zahl1 % zahl2) % (zahl2 % (zahl1 % zahl2))) + " ist ggT!");
						}
					}
				}
			}
			
		}
	}
}
