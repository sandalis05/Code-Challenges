
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Bravo138011 {
	public static void main(String[] args) {
		
		Scanner fin = null;
		
		try 
		{
			fin = new Scanner( new File("bravo.dat") );
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
			String text = fin.nextLine();
			System.out.println(text);
			for(int index = 1; index < text.length(); index++)
			{
				String printed = "";
				printed = printed.concat(text.substring(index, text.length()));
				if(printed.length() < text.length() && ( text.length() - printed.length() ) > 0)
				{
					System.out.print(printed);
					for(int x = 0; x < ( text.length() - printed.length() ); x++)
					{
						System.out.print(text.substring(x, x+1));
					}
				}
				System.out.println();
			}
			System.out.println();
		}
		
		//End of the solution
		
		fin.close();
	}

}
