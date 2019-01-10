/*Written by Nick VonDollen
 * 11/7/2016
 * CS 249
 */
import java.util.*;
import java.io.*;
import java.net.URL;
public class Assign7_2 {
	
	public static void main(String[] args) throws Exception {
		try{
			System.out.println("Enter a URL or a file name: ");
			Scanner keyboard = new Scanner(System.in);
			String path = keyboard.next();
			
			WordCountData ourData = WordCounter.count(path);
			System.out.println("Number of characters: " + ourData.getCharCnt());	
			System.out.println("Number of lines: " + ourData.getLineCnt());
			System.out.println("Number of words: " + ourData.getWordCnt());
			
			PrintWriter output = new PrintWriter(path);
			output.println("output.txt");
			output.println(ourData.getCharCnt());
			output.println(ourData.getLineCnt());
			output.println(ourData.getWordCnt());
			output.close();
		}
			catch(Exception ex)
			{
				System.err.println("OH NO");
				ex.printStackTrace();
				
			}
		}
	}

