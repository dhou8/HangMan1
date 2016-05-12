
public class Player
{
    private int score;
    private String name;
    
    public Player(String person, int num)
    {
        name=person;
        score=num;
    }
    
    // gets the score
    public int getScore()
    {
        return score;
    }
    
    // gets the Name of the player
    public String getName()
    {
        return name;
    }
    
    // sorts the leaderboard into top 10 players
    public void sort()
    {
    }
}
