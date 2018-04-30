
public class Task1 {
		
	
	/**
	 * This method calculates the product of two positive Integers n1 and n2 while n1<n2 and 
	 * in the end it will give an exemplary calculation with n1=6 and n2=11
	 * @param numbers will be multiplied and the result will be given
	 * @return the product of n1 and n2
	 */
	
		public static void multiplication(int n1, int n2){
			
			do{
				int outcome = n1 * n2;
				System.out.println(n1 + " * " + n2 + " = " + outcome );
				n1++;
			}
			
		 while (n1<n2);
		}
}
		

	

