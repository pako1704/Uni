/**
 * Represents a season of a {@link Series}. Additional to the associated series, it has a name and a number.
 * 
 * @author Joshua Gleitze, Paul Kolb
 * @version 1.0
 */
public class Season {
    private String name;
    private int number;
    private Series series;
    
    Season(Series series, int seasonNumber){
    	this.series = series;
    	this.number = seasonNumber;
    	
    }
}
