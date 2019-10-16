import java.io.*; 
import java.util.*; 

public class WordCountList
{
    protected List<WordCount> list; 
    private static String PRINT_FILE_NAME = "myOutput.out"; 

    /**
     * Constructor for a new, empty, WordCountList. 
     */
    public WordCountList()
    {
        list = new ArrayList(); 
    }

    public String toString()
    { 
        // TODO
    }

    public void getWordsFromFile(String filename) throws IOException
    {
        // TODO
    }

    public void addWord(WordCount word)
    {
        // TODO
    }

    public void removeWords(String omitFilename) throws IOException
    {
        // TODO
    }

    public void outputWords(boolean printToConsole) throws IOException
    {
        // TODO
    }

    public List<WordCount> topKWords(int k)
    {
        // TODO
    }
}
