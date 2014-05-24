import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class _08_ExtractEmails {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String string = scanner.nextLine().toLowerCase();
		Pattern emailPattern = Pattern
				.compile("[\\w-+]+(?:\\.[\\w-+]+)*@(?:[\\w-]+\\.)+[a-zA-Z]{2,7}");
		Matcher matcher = emailPattern.matcher(string);
		
		while (matcher.find()) {
			System.out.println(matcher.group());
		}
	}
}
