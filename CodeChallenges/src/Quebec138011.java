import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class Quebec138011 {
	public static void main(String[] args) {

		Scanner fin = null;

		try {
			fin = new Scanner(new File("quebec.txt"));
		} catch (FileNotFoundException e) {
			System.out.println("Oops! File could not be found.");
			System.exit(0);
		}

		// start of the solution

		// number of labels
		int numPallets = fin.nextInt();
		fin.nextLine();

		// labels
		String in = fin.nextLine();
		String[] labels = in.split(" ");

		// instructions
		String[] s = fin.nextLine().split(" ");
		int[] instructions = new int[s.length];
		for (int i = 0; i < s.length; i++) {
			instructions[i] = Integer.parseInt(s[i]);
		}

		List<String> strs = new ArrayList<String>();
		for (int i = 0; i < labels.length; i++) {
			strs.add(labels[i]);
		}
		List<Stack<String>> stacks = new ArrayList<Stack<String>>();

		for (int i = 0; i < numPallets; i++) {
			Stack<String> st = new Stack<>();
			stacks.add(st);
		}

		for (int i = 0; i < labels.length; i++) {
			stacks.get(0).push(labels[i]);
		}

		for (Integer i : instructions) {
			if (!stacks.get(i).isEmpty()) {
				String val = stacks.get(i).pop();
				stacks.get(i + 1).push(val);
			}
		}

		System.out.println(stacks.get(stacks.size() - 1));

		// End of the solution

		fin.close();

	}
}
