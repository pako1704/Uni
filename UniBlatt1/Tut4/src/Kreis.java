
public class Kreis {
    private double radius;
    private String flaeche;
    private double umfang;
    
    
    //radius in meters
    public Kreis(float radius){
        this.radius = radius;        //this.radius = (double) radius;
        
    }
    
    public Kreis(String flaeche){
        this.radius = this.flaecheToRadius(Double.parseDouble(flaeche));
    }
    
    public Kreis(double umfang, LenthUnit lengthUnit){
        
    }
    
    private double flaecheToRadius (double flaeche){
        return Math.sqrt(flaeche / Math.PI);
    }
    
    

}
