import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Oscar138011 {
	public static void main(String[] args) {
		
		Scanner fin = null;
		
		try 
		{
			fin = new Scanner( new File("oscar.txt") );
		} 
		catch (FileNotFoundException e) 
		{
			System.out.println("Oops! File could not be found.");
			System.exit(0);
		}
		
		//start of the solution
		int[][] numbers = new int[10][20];
		
		for (int r = 0; r < numbers.length; r++)
		{
			for (int c = 0; c < numbers[r].length; c++)
			{
				numbers[r][c] = fin.nextInt();
			}
			fin.nextLine();
		}
	
		int numSurveys = fin.nextInt();
		
		for (int i = 0; i < numSurveys; i++)
		{
			char type = fin.next().charAt(0);
			int row = fin.nextInt();
			int col = fin.nextInt();
			
			if (type == 'S')
			{
				System.out.print(numbers[row][col]);
			}
			if (type == 'M')
			{
				//start
				int rowStart = row - 1;
				if (rowStart < 0)
				{
					rowStart = 0;
				}
				int colStart = col - 1;
				if (colStart < 0)
				{
					colStart = 0;
				}
				//stop
				int rowStop = row + 1;
				if (rowStop >= 10)
				{
					rowStop = 9;
				}
				int colStop = col + 1;
				if (colStop >= 20)
				{
					colStop = 19;
				}
				//sum loop
				int sum = 0;
				for (int r = rowStart; r <= rowStop; r++)
				{
					for (int c = colStart; c <= colStop; c++)
					{
						sum += numbers[r][c];
					}
				}
				System.out.print(sum);
			}
			if (type == 'L')
			{
				//start
				int rowStart = row - 2;
				if (rowStart < 0)
				{
					rowStart = 0;
				}
				int colStart = col - 2;
				if (colStart < 0)
				{
					colStart = 0;
				}
				//stop
				int rowStop = row + 2;
				if (rowStop >= 10)
				{
					rowStop = 9;
				}
				int colStop = col + 2;
				if (colStop >= 20)
				{
					colStop = 19;
				}
				//sum loop
				int sum = 0;
				for (int r = rowStart; r <= rowStop; r++)
				{
					for (int c = colStart; c <= colStop; c++)
					{
						sum += numbers[r][c];
					}
				}
				System.out.print(sum);				
			}
			
			System.out.println();
		}
		
			
			
	
		//End of the solution
		
		fin.close();
	}
}
	


