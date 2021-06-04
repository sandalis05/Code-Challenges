
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Hotel138011 {
	public static void main(String[] args) {
		
		Scanner fin = null;
		
		try 
		{
			fin = new Scanner( new File("hotel.txt") );
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
			int base = fin.nextInt();
			
			int x = 0;
			x = fin.nextInt(base);
			
			int y = 0;
			y = fin.nextInt(base);
		
			System.out.println(x + " + " + y + " = " + (x+y));
		}
		
		//End of the solution
		
		fin.close();
	}

}
