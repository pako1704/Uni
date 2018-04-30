package uebung07;

import javax.swing.JOptionPane;

public class Stringort {
	public static void main(String[] args) {

		String eingabe1, eingabe2, eingabe3;
		eingabe1 = JOptionPane.showInputDialog("Erstes Wort:");
		eingabe2 = JOptionPane.showInputDialog("Zweites Wort:");
		eingabe3 = JOptionPane.showInputDialog("Drittes Wort:");

		System.out.println(eingabe1.compareTo(eingabe2));
		// System.out.println(eingabe1.compareTo(eingabe3));
		// System.out.println(eingabe2.compareTo(eingabe3));
		if ((eingabe1.compareTo(eingabe2) < 0) && (eingabe2.compareTo(eingabe3) < 0)) {
			System.out.println(eingabe1);
			System.out.println(eingabe2);
			System.out.println(eingabe3);
		} else {
			if ((eingabe1.compareTo(eingabe3) < 0) && (eingabe3.compareTo(eingabe2) < 0)) {
				System.out.println(eingabe1);
				System.out.println(eingabe3);
				System.out.println(eingabe2);
			} else {
				if ((eingabe2.compareTo(eingabe3) < 0) && (eingabe3.compareTo(eingabe1)) < 0) {
					System.out.println(eingabe2);
					System.out.println(eingabe3);
					System.out.println(eingabe1);
				} else {
					if ((eingabe2.compareTo(eingabe1) < 0) && (eingabe1.compareTo(eingabe3)) < 0) {
						System.out.println(eingabe2);
						System.out.println(eingabe1);
						System.out.println(eingabe3);
					} else {
						if ((eingabe3.compareTo(eingabe2) < 0) && (eingabe2.compareTo(eingabe1)) < 0) {
							System.out.println(eingabe3);
							System.out.println(eingabe2);
							System.out.println(eingabe1);
						}
					}
				}
			}
		}
	}
}
