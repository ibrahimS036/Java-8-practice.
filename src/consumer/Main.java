package consumer;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Main {

	public static void main(String[] args) {

		// Consumer<String> consumer = s -> System.out.println(s);
		// consumer.accept("ibrahimThedeveloper");

		// Consumer:1
		Consumer<List<Integer>> listconsume1 = li -> {
			for (Integer i : li) {
				System.out.println(i + 100);
			}
		};

		// Consumer:2
		Consumer<List<Integer>> listconsumer2 = li2 -> {
			for (Integer i : li2) {
				System.out.println(i);
			}
		};

		listconsumer2.andThen(listconsume1).accept(Arrays.asList(1, 2, 3, 4));

	}

}
