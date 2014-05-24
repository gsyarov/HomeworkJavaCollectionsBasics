import java.util.Scanner;

public class _06_CountSpecifiedWord {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String string = scanner.nextLine().toLowerCase();
		String word = scanner.nextLine().toLowerCase();
		String[] stringArray = string.split("\\W+");
		int count = 0;

		for (int i = 0; i < stringArray.length; i++) {
			if (word.equals(stringArray[i])) {
				count++;
			}
		}
		System.out.println(count);
	}
}
