
public class lol {
	public static void main(String[] args) {
		// Einzelpreise der Waren
		double wurst = 4.2;

		// Anzahl der Waren
		int anzWurst = 0;

		// Inhalt der Brieftasche
		double brieftasche = 50.0;

		// Summe gekaufter Waren
		double summe = 0;

		if (summe > brieftasche) {
			System.out.println("Sie haben nicht genug Geld in Ihrer Brieftasche");
		} else {
			if (summe + wurst < brieftasche) {
				summe = summe + wurst;
				anzWurst = anzWurst + 1;
			}

			if (summe + wurst < brieftasche) {
				summe = summe + wurst;
				anzWurst = anzWurst + 1;
			}

			if (summe + wurst < brieftasche) {
				summe = summe + wurst;
				anzWurst = anzWurst + 1;
			}

			if (summe + wurst < brieftasche) {
				summe = summe + wurst;
				anzWurst = anzWurst + 1;
			}

			if (summe + wurst < brieftasche) {
				summe = summe + wurst;
				anzWurst = anzWurst + 1;
			}

			if (summe + wurst < brieftasche) {
				summe = summe + wurst;
				anzWurst = anzWurst + 1;
			}

			if (summe + wurst < brieftasche) {
				summe = summe + wurst;
				anzWurst = anzWurst + 1;
			}

			if (summe + wurst < brieftasche) {
				summe = summe + wurst;
				anzWurst = anzWurst + 1;
			}

			if (summe + wurst < brieftasche) {
				summe = summe + wurst;
				anzWurst = anzWurst + 1;
			}

			if (summe + wurst < brieftasche) {
				summe = summe + wurst;
				anzWurst = anzWurst + 1;
			}

			if (summe + wurst < brieftasche) {
				summe = summe + wurst;
				anzWurst = anzWurst + 1;
			}

			if (summe + wurst < brieftasche) {
				summe = summe + wurst;
				anzWurst = anzWurst + 1;
			}

			if (summe + wurst < brieftasche) {
				summe = summe + wurst;
				anzWurst = anzWurst + 1;
			}

			if (summe + wurst < brieftasche) {
				summe = summe + wurst;
				anzWurst = anzWurst + 1;
			}

			if (summe + wurst < brieftasche) {
				summe = summe + wurst;
				anzWurst = anzWurst + 1;
			}

			if (summe + wurst < brieftasche) {
				summe = summe + wurst;
				anzWurst = anzWurst + 1;
			}

			if (summe + wurst < brieftasche) {
				summe = summe + wurst;
				anzWurst = anzWurst + 1;
			}

			if (summe + wurst < brieftasche) {
				summe = summe + wurst;
				anzWurst = anzWurst + 1;
			}

			if (summe + wurst < brieftasche) {
				summe = summe + wurst;
				anzWurst = anzWurst + 1;
			}

			if (summe + wurst < brieftasche) {
				summe = summe + wurst;
				anzWurst = anzWurst + 1;
			}

			if (summe + wurst < brieftasche) {
				summe = summe + wurst;
				anzWurst = anzWurst + 1;
			}

			// Strings lassen sich sehr gut formatieren:
			// http://docs.oracle.com/javase/6/docs/api/java/util/Formatter.html#syntax
			System.out.println(String.format("%-9s %2d x %5.2f EUR", "Wurst", anzWurst, wurst));
			System.out.println(String.format("%30.2f EUR", anzWurst * wurst));

			System.out.println("_________________________________");

			System.out.println(String.format("%-9s %20.2f EUR", "Gesamt", summe));
			System.out.println(String.format("%-9s %20.2f EUR", "Gegeben", brieftasche));
			System.out.println();
			System.out.println(String.format("%-9s %20.2f EUR", "Zurück", brieftasche - summe));
		}
	}
}
