import java.util.ArrayList;
import java.util.Scanner;

public class _04_LongestIncreasingSequence {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String elementString = scanner.nextLine();
		String[] elementArray = elementString.split(" ");
		int[] numArray = new int[elementArray.length];
		int count = 1;
		int maxCount = 1;
		int position = 0;

		for (int i = 0; i < numArray.length; i++) {
			numArray[i] = Integer.parseInt(elementArray[i]);
		}

		System.out.print(elementArray[0]);
		for (int i = 1; i < elementArray.length; i++) {
			if (numArray[i] > numArray[i - 1]) {
				count++;
				System.out.print(" " + numArray[i]);
			} else {
				count = 1;
				System.out.println();
				System.out.print(numArray[i]);
			}
			if (maxCount < count) {
				maxCount = count;
				position = i;
			}
		}
		System.out.println();

		System.out.print("Longest:");
		for (int j = 0; j < maxCount - 1; j++) {
			System.out.print(numArray[position + j - (maxCount - 1)] + " ");
		}
		System.out.println(numArray[position]);
	}
}
