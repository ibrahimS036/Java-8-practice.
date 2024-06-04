package function;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class Main {

	public static void main(String[] args) {
		Function<String, Integer> function1 = x -> x.length();
		// System.out.println(function.apply("chiller"));
		Function<String, String> function2 = x -> x.substring(0, 3);
		Function<List<Student>, List<Student>> studentWithiPrefix = li -> {
			List<Student> list = new ArrayList<>();
			for (Student s : li) {
				if (function2.apply(s.getName()).equals("ibr")) {
					list.add(s);
				}
			}
			return list;
		};

		Student s1 = new Student(2, "ibru");
		Student s2 = new Student(3, "Munna");
		Student s3 = new Student(1, "ibrahim");
		List<Student> students = Arrays.asList(s1, s2, s3);
		List<Student> filteredStident = studentWithiPrefix.apply(students);
		System.out.println(filteredStident);

	}

}
