
public class Circledata {
  public static void main(String [] args){
    double radius = 3.0 ;
    double pi = 3.14159;
    double flaecheninhalt;
    double kreisumfang;
    
    flaecheninhalt = radius * radius * pi;
    kreisumfang = 2 * pi * radius;
    
    System.out.println("Flächeninhalt: " + flaecheninhalt + " LE");
    System.out.println("Kreisumfang: " + kreisumfang + " LE");
  }
}
