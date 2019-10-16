/**
 * Filename: WordCountListTest.java
 * Created by: Yuling Shi for FA19
 * Date: 10/13/2019
 * Description: This is a JUnit file containing basic test cases for 
 * WordCountList class. You should add more test cases to thoroughly test your 
 * methods even though you don't need to submit this file 
 */

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.util.List;
import java.util.ArrayList;
import java.io.*;

/**
 * Unit tests for WordCountList.java, using JUnit 5
 * javac WordCountList.java
 * javac -cp junit-platform-console-standalone-1.5.2.jar:. WordCountListTest.java
 * java -jar junit-platform-console-standalone-1.5.2.jar --class-path . --scan-class-path
 */
class WordCountListTest{
      
      @Test
      void testAddWord(){
         // Construct the answer
         List<WordCount> answer = new ArrayList(); 
         answer.add( new WordCount("CSE", 10));
         
         // Student's result
         WordCountList result = new WordCountList();
         result.addWord(new WordCount("CSE", 10));
         
         // Compare adding non-exisitng word
         assertEquals( answer, result.list);

         // Contruct the answer
         answer.add( 0, new WordCount("8B", 20));

         // Student's result
         result.addWord(new WordCount("8B", 10));
         result.addWord(new WordCount("8B", 10));

         //Compare adding existing word
         assertEquals( answer, result.list);
      }

      
      @Test
      void testToString(){
         // Construct the answer
         String answer = "a(1) is(2) this(3)";

         // Student's result
         WordCountList result = new WordCountList();
         result.list.add( new WordCount("a", 1));
         result.list.add( new WordCount("is", 2));
         result.list.add( new WordCount("this", 3));

         // Copmare
         assertEquals( answer, result.toString());
      }


      @Test
      public void testGetWordsFromFile() throws IOException {
         // Construct the answer paul.(1) 8b(2) cse(2) paul(2)
         List<WordCount> answer = new ArrayList(); 
         answer.add( new WordCount("paul.", 1));
         answer.add( new WordCount("8b", 2));
         answer.add( new WordCount("cse", 2));
         answer.add( new WordCount("paul", 2));
         
         // Student's result
         WordCountList result = new WordCountList();
         result.getWordsFromFile("ExampleFile.txt");

         // Compare
         assertEquals( answer, result.list);
      }

      @Test
      public void testRemoveWords() throws IOException{
         // Construct the answer
         List<WordCount> answer = new ArrayList(); 
         answer.add( new WordCount("Fall2019", 10));

         // Student's result
         WordCountList result = new WordCountList();
         
         result.list.add( new WordCount("paul.", 1));
         result.list.add( new WordCount("8b", 2));
         result.list.add( new WordCount("cse", 2));
         result.list.add( new WordCount("Fall2019", 10));

         result.removeWords("ExampleFile.txt");

         // Compare
         assertEquals( answer, result.list);
      }
      
      @Test
      public void testTopKWords(){
         // Construct the answer
         List<WordCount> answer = new ArrayList();
         answer.add( new WordCount("paul", 10));
         answer.add( new WordCount("cse", 3));
         answer.add( new WordCount("8b", 2));

         // Student's answer
         WordCountList result = new WordCountList();
         
         result.list.add( new WordCount("paul.", 1));
         result.list.add( new WordCount("8b", 2));
         result.list.add( new WordCount("cse", 3));
         result.list.add( new WordCount("paul", 10));

         // Compare
         assertEquals( answer, result.topKWords(3)); // k <= length
         answer.add( new WordCount("paul.", 1));
         assertEquals( answer, result.topKWords(5)); // k > length
      }

}
