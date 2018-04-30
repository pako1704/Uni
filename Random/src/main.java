import java.util.Random;
public class main{
	public static void main(String[] args){
		
		int anzahlDerZahlen = 15;
		int ersteZahl = 1;
		
		Random generierMal = new Random();
		
		int random = generierMal.nextInt(anzahlDerZahlen) + ersteZahl;
		for(int i = 1; i <= 1; i++ ){
			random = generierMal.nextInt(anzahlDerZahlen) + ersteZahl;
			System.out.println(random);
		}
	}
}
	 