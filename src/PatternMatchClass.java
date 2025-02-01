import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatchClass {
	public static void main(String[] args) {
		String name = "Abhishek";
		System.out.println(Pattern.matches("Abhi*", name));

		Pattern p = Pattern.compile("Abhishek");

		Matcher match = p.matcher("Abhishek.Dixit");
		while (match.find()) {
			System.out.println("Pattern found from " + match.start() + " to " + (match.end() - 1));
		}
	}
}
