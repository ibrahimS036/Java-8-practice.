package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) {

		//Ways of creating streams.
		List<String> list = Arrays.asList("leoleo", "Nadeem", "gufran");
		Stream<String> myStream = list.stream();
		System.out.println(myStream);

		String[] array = { "Apple", "banana", "Cherryy" };
		Stream<String> stream = Arrays.stream(array);
		System.out.println(stream);

		Stream<Integer> integerStream = Stream.of(1, 2, 3);
		Stream<String> of = Stream.of("umar", "aqib", "Abid");

		Stream<Integer> limit = Stream.iterate(0, n -> n + 1).limit(100);
		Stream<String> limit2 = Stream.generate(()->"Hello").limit(5);

	}

}
