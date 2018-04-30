
public class Main {

	public static void main(String[] args) {
		
		//method product will be called
		product(6,11);
		countdown(5,0);
		numberSequence(1,14);
	}
	private static void numberSequence(int n1, int n2) {
		System.out.print("\n");
		while(n1 <= n2){
			if(n1%2!=0){
				System.out.print(n1 + " ");
			}
			n1++;
		}
	}
		/**
	 * This method calculates the product of two positive Integers n1 and n2 while n1<n2 and 
	 * in the end it will give an exemplary calculation with n1=6 and n2=11
	 * @param numbers will be multiplied and the result will be given
	 * @return the product of n1 and n2
	 * @author Paul Kolb
	 */
	private static void product(int n1, int n2) {
		// choosed do-while-loop to create the product
		int outcome = 1;
		while (n1<=n2) {
			outcome = n1 * outcome;
			n1++;
		}
		System.out.println( outcome );
	}
	private static void countdown(int n1, int n2) {
		
		do{
			System.out.print(n1 + " " );
			n1--;
			
		}
		while(n1>=n2);
		
	}


}



