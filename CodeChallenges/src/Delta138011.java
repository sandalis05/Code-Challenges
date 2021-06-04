import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Delta138011 {
	public static void main(String[] args) {
		
		Scanner fin = null;
		
		try 
		{
			fin = new Scanner( new File("delta.dat") );
		} 
		catch (FileNotFoundException e) 
		{
			System.out.println("Oops! File could not be found.");
			System.exit(0);
		}
		
		//start of the solution
		
		String text = fin.nextLine();
		String[] nums = text.split(" ");
		int[] numbers = new int[nums.length];
		
		for (int i = 0; i < numbers.length; i++)
		{
			numbers[i] = Integer.parseInt(nums[i]);
		}
		
		for (int i = 0; i < numbers.length; i++)
		{
			for (int j = i + 1; j < numbers.length; j++)
			{
				if (numbers[i] > numbers[j])
				{
					int temp = numbers[i];
					numbers[i] = numbers[j];
					numbers[j] = temp;
				}
			}
		}
		
		int median = numbers[(int)numbers.length/2];
		System.out.print(median);
		
		//End of the solution
		
		fin.close();
	}

}
