import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Foxtrot138011 {

	public static void main(String[] args) {
		
		Scanner fin = null;
		
		try 
		{
			fin = new Scanner( new File("foxtrot.dat") );
		} 
		catch (FileNotFoundException e) 
		{
			System.out.println("Oops! File could not be found.");
			System.exit(0);
		}
		
		//start of the solution
		
		int n = fin.nextInt();
		
		for(int i = 0; i <= n; i++)
		{
			String text = fin.nextLine();
			String[] words = text.split(" ");
			for (int j = words.length - 1; j >= 0; j--)
			{
				System.out.print(words[j] + " ");
			}
			System.out.println();
		}
		
		//End of the solution
		
		fin.close();
	}
}

