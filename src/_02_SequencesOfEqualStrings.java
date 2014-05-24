import java.util.Scanner;

public class _02_SequencesOfEqualStrings {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String elementString = scanner.nextLine();
		String[] elementArray = elementString.split(" ");

		System.out.print(elementArray[0]);
		for (int i = 1; i < elementArray.length; i++) {
			if (elementArray[i].equals(elementArray[i - 1])) {
				System.out.print(" " + elementArray[i]);
			} else {
				System.out.println();
				System.out.print(elementArray[i]);
			}
		}
	}

}
