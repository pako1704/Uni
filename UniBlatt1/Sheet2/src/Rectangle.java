
public class Rectangle {
  /**
   * This Methods constructs a new Rectangle, 
   * initialized to match the values of the specified Rectangle. 
   * 
   * @param a and b are the two lengths of sides
   * @return a multiplied with b
   */

  private int a;
  private int b;

  public Rectangle(int a, int b) {
    this.a = a;
    this.b = b;
  }

  public static int surface(Rectangle rectangle) {
    return rectangle.a * rectangle.b;
  }

  public int surface() {
    return a * b;
  }

}
