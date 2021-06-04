import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Stack;


public class Uniform138011 {
	public static void main(String[] args) {

		Scanner fin = null;

		try {
			fin = new Scanner(new File("uniform.txt"));
		} catch (FileNotFoundException e) {
			System.out.println("Oops! File could not be found.");
			System.exit(0);
		}

		// start of the solution

		int numTraversals = fin.nextInt();
		fin.nextLine();

		for (int i = 0; i < numTraversals; i++)
		{
			Stack<String> s1 = new Stack<>();
			//Stack<String> s2 = new Stack<>();
			
			String line = fin.nextLine();
			String[] s = line.split(" ");
			
			for(int j = 0; j < s.length; j++)
			{
				if(!s[j].equals("+") && !s[j].equals("-") && !s[j].equals("*") && !s[j].equals("/"))
				{
					s1.push(s[j]);
				}
				else
				{
					String num1 = s1.pop();
					String num2 = s1.pop();
					String operator = s[j];
					
					if (operator.equals("+"))
					{
						int x = Integer.parseInt(num2) + Integer.parseInt(num1);
						s1.push(String.valueOf(x));
					}
					if (operator.equals("-"))
					{
						int x = Integer.parseInt(num2) - Integer.parseInt(num1);
						s1.push(String.valueOf(x));
					}
					if (operator.equals("*"))
					{
						int x = Integer.parseInt(num2) * Integer.parseInt(num1);
						s1.push(String.valueOf(x));
					}
					if (operator.equals("/"))
					{
						int x = Integer.parseInt(num2) / Integer.parseInt(num1);
						s1.push(String.valueOf(x));
					}
				}
			}
			System.out.println(s1);
		}

  }
}
