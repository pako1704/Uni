package uebung06;

public class Konto {
    private String kontonummer;
    private double kontostand;

    public Konto(String kn, double ks) {
        this.kontonummer = kn;
        this.kontostand = ks;
    }

    public double getKontostand() {
        return kontostand;
    }

    public String getKontonummer() {
        return kontonummer;
    }

    public void einzahlen(double amount) {
        kontostand += amount;
    }

    public void auszahlen(double amount) {
        kontostand -= amount;
    }
}
