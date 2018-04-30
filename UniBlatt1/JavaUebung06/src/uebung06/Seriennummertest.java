package uebung06;

public class Seriennummertest {
	public static void main(String[] args){
		BruchMitSeriennummer a = new BruchMitSeriennummer(1,2);
		BruchMitSeriennummer b = new BruchMitSeriennummer(1,4);
		BruchMitSeriennummer c = new BruchMitSeriennummer(1,5);
		BruchMitSeriennummer d = new BruchMitSeriennummer(1,6);
		BruchMitSeriennummer e = new BruchMitSeriennummer(1,9);
		
		System.out.println("Bruch 1, Seriennummer: " + a.getSeriennummer() + "\tBruch: " + a.bruchToString());
		System.out.println("Bruch 2, Seriennummer: " + b.getSeriennummer() + "\tBruch: " + b.bruchToString());
		System.out.println("Bruch 3, Seriennummer: " + c.getSeriennummer() + "\tBruch: " + c.bruchToString());
		System.out.println("Bruch 4, Seriennummer: " + d.getSeriennummer() + "\tBruch: " + d.bruchToString());
		System.out.println("Bruch 5, Seriennummer: " + e.getSeriennummer() + "\tBruch: " + e.bruchToString());
		
		
	}
}
