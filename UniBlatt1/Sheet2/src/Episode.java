/**
 * One episode of a {@link Season}. Additional to its associated season, it has
 * a name, a number, a {@link Date} of first broadcast and a main actor.
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

  /**
   * This constructor initializes "season" of the type "Season" and 
   * "episodeNumber" of the type "Integer".
   * @param season is initialized in the constructor "Episode"
   * @param episodeNumber is an Integer initialized in "Episode"
   */
  
  public Episode(Season season, int episodeNumber) {
    this.season = season;
    this.number = episodeNumber;

  }
}
