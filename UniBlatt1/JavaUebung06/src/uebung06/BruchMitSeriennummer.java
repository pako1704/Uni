package uebung06;

public class BruchMitSeriennummer extends Bruch {
	private final int seriennummer;
	public static int anzahl;
	public BruchMitSeriennummer(int x, int y){
		super(x,y);
		anzahl++;
		seriennummer = anzahl;		
	}
	
	public BruchMitSeriennummer(){
		this(0,1);
	}
	
	public BruchMitSeriennummer(int x){
		this(x,1);
	}
	
	public int getSeriennummer(){
		return seriennummer;
	}
}
