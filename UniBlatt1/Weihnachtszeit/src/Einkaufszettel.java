
public class Einkaufszettel {
	
	//single price of the products
	
	double [] Einkaufszettel = new double[4];
	private double kaese = 4.0;
	private double wurst = 2.0;
	private double zahnpasta = 1.0;
	private double handy = 150.0;
	private double summe;
	private double brieftasche = 250.0;
	
	//number of products
	private int anzKaese = 3;
	private int anzWurst = 5;
	private int anzZahnpasta = 1;
	private int anzHandy = 1;

	public Einkaufszettel(double kaese, double wurst, double zahnpasta, double handy, double brieftasche){
		this.kaese = kaese;
		this.wurst = wurst;
		this.zahnpasta = zahnpasta;
		this.handy = handy;
	}
	
	public Einkaufszettel(int anzKaese, int anzWurst, int anzZahnpasta, int anzHandy){
		this.anzKaese = anzKaese;
		this.anzWurst = anzWurst;
		this.anzZahnpasta = anzZahnpasta;
		this.anzHandy = anzHandy;
	}
	
	public void schreibeEinkaufszettel(){
		System.out.println(kaese + "€/kg Käse" + "			" + anzKaese + " Stück");
		System.out.println(wurst + "€/kg Wurst" + "			" + anzWurst + " Stück");
		System.out.println(zahnpasta + "€/kg Zahnpasta" + "		" + anzZahnpasta + " Stück");
		System.out.println(handy + "€/kg Handy"  + "			" + anzHandy + " Stück");
		System.out.println("_ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _  _ _ _ _");
		System.out.println();
		System.out.println(brieftasche + " € in der Brieftasche");
	}
	
	public double add(double kaese, double wurst, double zahnpasta, double handy){
		if(kaese == 0){
			if(wurst == 0){
				if(zahnpasta == 0){
					if(handy == 0){
						return 0;
					}else{
						return add(kaese, wurst, zahnpasta, handy);
					}
				}
			}
			
		}
		return add(kaese,wurst,zahnpasta,handy);	
	}
	public double minus(double brieftasche){
		if(summe <= brieftasche){
			this.brieftasche -= summe;
		}else{
			System.out.println("Tut mir leid du hast zu wenig Geld dabei!");			
		}
		return brieftasche;
	}
	public double getKaese() {
		return this.kaese;
	}
	public void setKaese(double kaese) {
		this.kaese = kaese;
		}
	public double getWurst() {
		return this.wurst;
	}
	public void setWurst(double wurst) {
		this.wurst = wurst;
		}
	public double getZahnpasta() {
		return this.zahnpasta;
	}
	public void setZahnpasta(double zahnpasta) {
		this.zahnpasta = zahnpasta;
		}
	public double getHandy() {
		return this.handy;
	}
	public void setHandy(double handy) {
		this.handy = handy;
		}
	
	public double getAnzKaese() {
		return this.anzKaese;
	}
	public void setAnzKaese(int anzKaese) {
		this.anzKaese = anzKaese;
		}
	public double getAnzWurst() {
		return this.anzWurst;
	}
	public void setAnzWurst(int anzWurst) {
		this.anzWurst = anzWurst;
		}
	public double getAnzZahnpasta() {
		return this.anzZahnpasta;
	}
	public void setAnzZahnpasta(int anzZahnpasta) {
		this.anzZahnpasta = anzZahnpasta;
		}
	public double getAnzHandy() {
		return this.anzHandy;
	}
	public void setAnzHandy(int anzHandy) {
		this.anzHandy = anzHandy;
		}
}
