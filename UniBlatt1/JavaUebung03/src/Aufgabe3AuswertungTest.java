
public class Aufgabe3AuswertungTest {
	public static void main(String[] args) {
		int m = 12;
		int n = 81;
		while (m != n) {
			if (m > n) {
				m = m - n;
			} else {
				n = n - m;
			}
			System.out.println(m);
		}
	}
}
