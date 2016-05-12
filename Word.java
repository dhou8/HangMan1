
public class Word
{
    private String word;
    private String category;
    
    public Word(String name, String description)
    {
        word=name;
        category=description;
    }
    
    // gets the category of the specific word
    public String getCategory()
    {
        return category;
    }
    
    // gets the number of letters for the number of slots to fill
    public int getNumLetters()
    {
        return word.length();
    }
    
    // returns the word
    public String getWord()
    {
        return word;
    }
}
