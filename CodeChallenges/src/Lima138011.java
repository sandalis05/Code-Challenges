
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;


public class Lima138011 {
	public static void main(String[] args) {
		
		Scanner fin = null;
		
		try 
		{
			fin = new Scanner( new File("lima.txt") );
		} 
		catch (FileNotFoundException e) 
		{
			System.out.println("Oops! File could not be found.");
			System.exit(0);
		}
		
		//start of the solution
		int n = fin.nextInt();
		fin.nextLine();
		
		int numMatrix = 0;
		

		/////////////////////////
		
		while (numMatrix < n)
		{
			
			int d = fin.nextInt();
			fin.nextLine();
			
			String[][] arr = new String[d][d];
			
			for (int r = 0; r < d; r++)
			{
				for (int c = 0; c < d; c++)
				{
					arr[r][c] = fin.next();
				}
				fin.nextLine();
			}
			
			//rotate
			
			for (int col = 0; col < d; col++)
			{
				for (int row = d - 1; row >= 0; row--)
				{
					System.out.print(arr[row][col]);
				}
				System.out.println();
			}
			
			System.out.println();
		}	
			
	
		//End of the solution
		
		fin.close();
	}
}
	


