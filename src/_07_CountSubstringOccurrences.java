import java.util.Scanner;

public class _07_CountSubstringOccurrences {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String string = scanner.nextLine().toLowerCase();
		String word = scanner.nextLine().toLowerCase();
		int count = 0;

		for (int i = 0; i <= string.length() - word.length(); i++) {
			if (string.substring(0 + i, word.length() + i).contains(word)) {
				count++;
			}
		}
		System.out.println(count);

	}
}
