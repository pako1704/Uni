
public class ZahlendreieckDo {
	public static void main(String[] args){
		int zahl = 0;
		String s1 = "";
		do{
			s1 = s1 + " " + zahl;
			System.out.println(s1);
			zahl++;
		}while(zahl < 10);
	}
}
