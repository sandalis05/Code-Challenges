import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Example2 {

	public static void main(String[] args) {
		
		Scanner fin = null;
		
		try 
		{
			fin = new Scanner( new File("example2.dat") );
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
			System.out.println("I like " + text +"!");
		}
		
		//End of the solution
		
		fin.close();
	}
}
