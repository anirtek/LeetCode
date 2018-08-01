import java.util.Scanner;

public class FourLetterWordCount {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String input = in.nextLine();
		in.close();
		System.out.println(four_letter_words(input));
	}

	public static int four_letter_words(String sentence) {
		int four_count = 0;
		if (sentence.length() == 0 || sentence == null) return four_count;
		String[] words = sentence.split(" ");
		for(String each : words) if(each.length() == 4) four_count++;
		return four_count;
	}

}
