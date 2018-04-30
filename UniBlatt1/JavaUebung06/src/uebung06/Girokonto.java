package uebung06;

public class Girokonto extends Konto {
    double limit;

    public Girokonto(String kn, double ks, double l) {
        super(kn, ks);
        limit = l;
    }

    public double getLimit() {
        return limit;
    }

    public void setLimit(double l) {
        this.limit = l;
    }

    public void auszahlen(double amount) {
        if ((getKontostand() - amount) >= limit * (-1)) {
            super.auszahlen(amount);
        } else {
            System.out.println(
                    "Es tut uns sehr leid, jedoch ist der Betrag, den Sie auszahlen wollen größer als Ihr Kontostand!");

        }
    }

}
