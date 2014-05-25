import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class _11_MostFrequentWord {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String[] strings = scanner.nextLine().toLowerCase().split("\\W+");

		Map<String, Integer> stringCounter = new TreeMap<>();

		for (String word : strings) {
			if (stringCounter.containsKey(word)) {
				stringCounter.put(word, stringCounter.get(word) + 1);
			} else
				stringCounter.put(word, 1);
		}

		int mostFrequent = 0;
		for (Map.Entry<String, Integer> word : stringCounter.entrySet()) {
			if (mostFrequent < word.getValue())
				mostFrequent = word.getValue();
		}

		for (Map.Entry<String, Integer> word : stringCounter.entrySet()) {
			if (mostFrequent == word.getValue())
				System.out.println(word.getKey() + " -> " + word.getValue());
		}
	}
}
