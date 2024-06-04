package streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamPractice {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("Umar");
		list.add("Ammar");
		list.add("Salim");
		list.add("irfan");

		List<String> filter = list.stream().filter(s -> s.startsWith("i")).map(String::toUpperCase)
				.collect(Collectors.toList());
		System.out.println(filter);

	}

}
