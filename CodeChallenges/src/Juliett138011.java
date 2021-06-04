
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Juliett138011 {
	public static void main(String[] args) {
		
		Scanner fin = null;
		
		try 
		{
			fin = new Scanner( new File("juliett.txt") );
		} 
		catch (FileNotFoundException e) 
		{
			System.out.println("Oops! File could not be found.");
			System.exit(0);
		}
		
		//start of the solution
		
		int n = fin.nextInt();
		fin.nextLine();
		
		for(int i = 0; i < n; i++)
		{
			ArrayList<String> letters = new ArrayList<String>();
			String text = fin.nextLine();
			
			//for each line of text do the vowel conversion
			for (int j = 0; j < text.length(); j++)
			{
				if (text.substring(j,j+1).equals("a") || text.substring(j,j+1).equals("e")|| text.substring(j,j+1).equals("i")|| text.substring(j,j+1).equals("o")|| text.substring(j,j+1).equals("u"))
				{
					letters.add(text.substring(j,j+1).toUpperCase());
				}
				else if (text.substring(j,j+1).equals("A") || text.substring(j,j+1).equals("E")|| text.substring(j,j+1).equals("I")|| text.substring(j,j+1).equals("O")|| text.substring(j,j+1).equals("U"))
				{
					letters.add(text.substring(j,j+1).toUpperCase());
				}
				else 
				{
					letters.add(text.substring(j,j+1).toLowerCase());
				}
			}
			
			//print ArrayList
			for (int k = 0; k < letters.size(); k++)
			{
				System.out.print(letters.get(k));
			}
			System.out.println();
			
		}
		
		//End of the solution
		
		fin.close();
	}

	

}
