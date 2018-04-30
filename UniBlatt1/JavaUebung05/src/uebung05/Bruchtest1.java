package uebung05;

public class Bruchtest1 {
	public static void main(String[] args){
		Bruch a = new Bruch(2,3);
		//a.zaehler = 3;
		//a.nenner = 4;
		Bruch b = new Bruch(4,7);
		//b.zaehler = 3;
		//b.nenner = 12;
		a.ausgeben();
		a.multiplikation(b);
		System.out.println();
		a.ausgeben();
		
	}
}
