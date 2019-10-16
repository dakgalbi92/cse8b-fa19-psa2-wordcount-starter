public class WordCount
{
    protected String word; 
    protected int count; 

    public WordCount(String word)
    {
        // TODO
    }

    public WordCount(String word, int count)
    {
        // TODO
    }

    public WordCount(WordCount wc)
    {
        // TODO
    }

    public int increment()
    {
        // TODO
    }
    
    public int add(int amount)
    {
        // TODO
    }

    public int setCount(int count)
    {
        // TODO
    }

    public String toString()
    {
        // TODO
    }

    /**
     * DO NOT MODIFY : PROVIDED METHOD
     * 
     * Override equals method for comparing with a WordCount. 
     * Compares the String stored in this object with the other object's word.
     * 
     * @param  o the object to be compared to. 
     * @return   true if <code>this.word.equals(((WordCount)o).word)</code>, 
     *           false otherwise. 
     */
    public boolean equals(Object o)
    {
        return  (o instanceof WordCount) && 
                (this.word==null ? 
                ((WordCount)o).word==null : 
                this.word.equals(((WordCount)o).word)); 
    }
}