import java.util.Scanner;

public class _05_CountAllWords {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String elementString = scanner.nextLine();
		String[] elementArray = elementString.split(" ");

		System.err.println(countWords(elementString));
	}

	public static int countWords(String s) {

		int wordCount = 0;

		boolean word = false;
		int endOfLine = s.length() - 1;

		for (int i = 0; i < s.length(); i++) {
			if (Character.isLetter(s.charAt(i)) && i != endOfLine) {
				word = true;
			} else if (!Character.isLetter(s.charAt(i)) && word) {
				wordCount++;
				word = false;
			} else if (Character.isLetter(s.charAt(i)) && i == endOfLine) {
				wordCount++;
			}
		}
		return wordCount;
	}

}
