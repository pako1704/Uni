/**
 * Models a simple series, having a name, a director and a genre.
 * 
 * @author Joshua Gleitze, Paul Kolb
 * @version 1.0
 */
public class Series {
    private String name;
    private Person director;
    private Genre genre;
    
    Series(String name){
    	this.name = name;
    }
}
