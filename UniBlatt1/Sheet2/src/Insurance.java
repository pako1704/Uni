
public class Insurance {
  private static final int[] dataPool = {33, 64, 85, 112};
  private static final double m = 0.5;
  
  public static void printCalculatedData(int unfaelle, int W) {
    double result = dataPool[unfaelle - 1] + m * W;
    System.out.println(result);
  }
}
