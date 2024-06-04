package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamOperations {

	public static void main(String[] args) {

		// Methods Covers in this code:filter,map,distinct,sorted,limit,skip

		List<Integer> list = Arrays.asList(10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 9, 10, 8);
		List<Integer> filteredList = list.stream().filter(x -> x % 2 == 0).map(x -> x / 2).distinct().sorted()
				.collect(Collectors.toList());
		System.out.println(filteredList);

		List<Integer> collect = filteredList.stream().map(x -> x / 2).collect(Collectors.toList());
		System.out.println(collect);

		List<Integer> asList = Arrays.asList(7, 5, 3, 8, 9, 24, 54);
		List<Integer> collect1 = asList.stream().sorted((a, b) -> b - a).limit(4).skip(1).collect(Collectors.toList());
		System.out.println(collect1);

		List<Integer> asList1 = Arrays.asList(7, 5, 3, 8, 9, 24, 54);
		List<Integer> collect2 = asList1.stream().sorted((a, b) -> b - a).limit(4).skip(1).collect(Collectors.toList());

		List<Integer> collect3 = Stream.iterate(0, x -> x + 1).limit(101).skip(1).filter(x -> x % 2 == 0)
				.map(x -> x / 10).distinct().sorted().peek(x -> System.out.println(x)).collect(Collectors.toList());

	}

}
