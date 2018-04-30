package rekursionuebungen;

public class Primzahlfinder {
	int n = 10;
	for(int i = 2; i <= n; i++){
		boolean isPrimzahl = true;
		for(int j = 2; j < i && isPrimzahl; j++){
			if((i % j) == 0){
				isPrimzahl = false;
			}
		}
		if(isPrimzahl = true){
			System.out.println(i + " ist eine Primzahl!");
		}
	}

}
