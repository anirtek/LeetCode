import java.util.Scanner;

public class BracketMatch {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String input = in.nextLine();
		in.close();
		System.out.println(bracket_match(input));
	}

	public static int bracket_match(String str) {
		int openBracketCount = 0;
		int closeBracketCount = 0;
		if (str.length() == 0 || str == null)
			return 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == '(')
				openBracketCount++;
			else if (str.charAt(i) == ')')
				closeBracketCount++;
		}
		return Math.abs(openBracketCount - closeBracketCount);
	}

}
