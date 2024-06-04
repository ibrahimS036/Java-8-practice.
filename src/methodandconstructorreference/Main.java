package methodandconstructorreference;

import java.util.Arrays;
import java.util.List;

public class Main {

	public static void print(String s) {
		System.out.println(s);
	}

	public static void main(String[] args) {

		List<String> students = Arrays.asList("irfan", "Shadab", "Nadeem");
		students.forEach(x -> System.out.println(x));
		students.forEach(Main::print);

	}

}
