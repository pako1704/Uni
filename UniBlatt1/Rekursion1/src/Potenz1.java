
public class Potenz1 {

  public static int pow(int base, int exponent) {
    if (exponent == 0) {
      return 1;
    } else {
      return base * Potenz1.pow(base, exponent - 1);
    }
  }
}
