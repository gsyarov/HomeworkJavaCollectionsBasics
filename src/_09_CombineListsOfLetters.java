import java.util.ArrayList;
import java.util.Scanner;

public class _09_CombineListsOfLetters {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ArrayList<Character> arrFirstLine = new ArrayList<Character>();
		ArrayList<Character> arrSecondLine = new ArrayList<Character>();
		ArrayList<Character> arrPrint = new ArrayList<Character>();

		for (char ch : scanner.nextLine().toCharArray()) {
			arrFirstLine.add(ch);
		}
		for (char ch : scanner.nextLine().toCharArray()) {
			arrSecondLine.add(ch);
		}
		arrPrint.addAll(arrFirstLine);

		for (int i = 0; i < arrSecondLine.size(); i++) {
			if (arrFirstLine.contains(arrSecondLine.get(i))) {
				continue;
			} else {
				arrPrint.add(' ');
				arrPrint.add(arrSecondLine.get(i));
			}
		}

		for (int i = 0; i < arrPrint.size(); i++) {
			System.out.print(arrPrint.get(i));
		}
	}
}
