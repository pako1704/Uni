
public class Point {
  private int x;
  private int y;
    
  // 1. Konstruktor
    
  Point() {
        this(0,0);
  }
    
  // 2. Konstruktor
    
  Point(int x, int y) {
    this.x = x;
    this.y = y;
  }

  // 3. Konstruktor

  Point(Point copy) {
        this(copy.getX(), copy.getY());
  }
    
  public int getX() {
    return x;
  }
    
  public void setX(int x) {
    this.x = x;
  }
    
  public int getY() {
    return y;
  }
    
  public void setY(int y) {
    this.y = y;
  }

}
