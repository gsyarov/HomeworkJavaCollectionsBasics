import java.util.Scanner;

public class _03_LargestSequenceOfEqualStrings {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String elementString = scanner.nextLine();
		String[] elementArray = elementString.split(" ");
		int counter = 1;
		int maxCount = 1;
		int position = 0;

		for (int i = 1; i < elementArray.length; i++) {
			if (elementArray[i].equals(elementArray[i - 1])) {
				counter++;
			} else {
				counter = 1;
			}
			if (maxCount < counter) {
				maxCount = counter;
				position = i - counter + 1;
			}
		}

		for (int j = 0; j < maxCount - 1; j++) {
			System.out.print(elementArray[position] + " ");
		}
		System.out.println(elementArray[position]);
	}
}
