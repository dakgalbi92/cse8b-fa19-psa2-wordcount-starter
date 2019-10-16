/**
 *  WordCountListRunner
 *  Author: Alan Kuo, 2018 & Madeline, 2019
 *
 *  Class to test run a WordCountList. The class expects two command line arguments:
 *  argument[0] is filename
 *  argument[1] is N, where N is the number of mostly occurring words to print
 *  argument[2] is file|console, where output will be directed
 *  Note that it expects a file with common word occurrences named "commonWords.txt"
 *
 */


import java.util.*;
import java.io.*;

public class WordCountListRunner {

  public static void main ( String[] args) throws IOException {
    // ensure numbers of parameters
    if(args.length!=3){
      System.out.println("Usage: java WordCountListRunner nameOfInputFile numberOfTopNWords {file|console} ");
      return;
    }
    // getting arguments and creating wcl
    String filename = args[0];
    String number = args[1];
    String option = args[2];
    WordCountList w = new WordCountList();
    int n = 10;

    // checking parameter types
    try{
      w.getWordsFromFile(filename);
    }
    catch(FileNotFoundException e){
      System.out.println("The file you entered does not exist!!");
      return;
    }
    try {
      n = Integer.parseInt(number);
    } 
    catch (NumberFormatException e) {
      System.out.println("Please pass in a valid number!");
      return;
    }
    if(!option.equals("file")&&(!option.equals("console"))){
      System.out.println("Please pass in the correct output options as third parameter!");
      return;
    }

    // reading, removing words, and outputting
    System.out.println("Reading in File: " + filename);
    
    System.out.println("Removing common words");
    w.removeWords("commonWords.txt");
    
    boolean printToConsole = option.equals("console")?true:false; 
    
    System.out.println("Printing the top " + n + " words " + (printToConsole ?"on console.":"in a file named myOutput.out."));

    w.list = w.topKWords(n);
    w.outputWords(printToConsole);

  }

}
