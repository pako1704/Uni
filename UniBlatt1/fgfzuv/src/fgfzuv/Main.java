package fgfzuv;
public class Main {

  /**
   * This is the main-method which has to be available to run the methods.
   * @param args contains the supplied command-line arguments 
   */
  public static void main(String[] args) {

    // method product will be called
    product(6, 11);
    countdown(5, 0);
    numberSequence(1, 14);
  }

  /**
   * This method calculates the product of two positive Integers n1 and n2
   * while n1 is smaller than n2. 
   * 
   * @param n1 and n2 are going to be multiplied
   * @return the product of n1 and n2
   * @author Paul Kolb
   */

  private static void product(int n1, int n2) {
    // choosed do-while-loop to create the product
    int outcome = 1;
    while (n1 <= n2) {
      outcome = n1 * outcome;
      n1++;
    }
    System.out.println(outcome);
  }

  /**
   * This method counts down from n1 to n2.
   * @param n1 is the parameter with which the countdown starts
   * @param n2 is the parameter with which the countdown ends
   */
  
  private static void countdown(int n1, int n2) {
    do {
      System.out.print(n1 + " ");
      n1--;

    } while (n1 >= n2);

  }
  
  /**
   * This method gives the number sequence of positive uneven numbers from n1 to n2.
   * @param n1 is the beginning parameter
   * @param n2 is the ending parameter
   */
  private static void numberSequence(int n1, int n2) {
    System.out.print("\n");
    while (n1 <= n2) {
      if (n1 % 2 != 0) {
        System.out.print(n1 + " ");
      }
      n1++;
    }
  }


}
