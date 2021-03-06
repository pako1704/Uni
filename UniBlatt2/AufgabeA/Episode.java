/**
 * One episode of a {@link Season}. Additional to its associated season, it has a name, a number, a {@link Date} of
 * first broadcast and a main actor.
 * 
 * @author Joshua Gleitze, Paul Kolb
 * @version 1.0
 */
public class Episode {
    private Season season;
	private String name;
    private int number;
    private Date firstBroadcast;
    private Person mainActor;
    
    Episode(Season season, int episodeNumber){
    	this.season = season;
    	this.number = episodeNumber;
    	
    }
}
