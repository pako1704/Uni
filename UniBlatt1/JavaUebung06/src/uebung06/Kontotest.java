package uebung06;

public class Kontotest {
	public static void main(String[] args) {
		
		Konto account = new Konto("000000001", 1000.0);
		System.out.println("Kontonummer: " + account.getKontonummer() + "\tKontostand: " + account.getKontostand() + " €");
		account.einzahlen(500);
		account.auszahlen(750.50);
		System.out.println("Kontonummer: " + account.getKontonummer() + "\tKontostand: " + account.getKontostand() + " €");
	}
}
