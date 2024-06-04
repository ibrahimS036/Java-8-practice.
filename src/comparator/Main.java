package comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {
		// ArrayList Example
//		List<Integer> list = new ArrayList<Integer>();
//		list.add(9);
//		list.add(8);
//		list.add(7);
//		list.add(2);
//		list.add(15);
//		Collections.sort(list,(a,b)->b-a);
//		System.out.println(list);

		// TreeSet Example
//		Set<Integer> s = new TreeSet<Integer>();
//		s.add(8);
//		s.add(7);
//		s.add(4);
//		s.add(2);
//		System.out.println("Before manual sorting" + s);
//		Set<Integer> ss = new TreeSet<Integer>((a, b) -> b - a);
//		ss.add(2);
//		ss.add(6);
//		ss.add(8);
//		ss.add(10);
//		ss.add(12);
//		System.out.println("after manual sorting" + ss);

		// TreeMap Example
//		Map<Integer, String> m = new TreeMap<Integer, String>();
//		m.put(2, "two");
//		m.put(3, "three");
//		m.put(1, "one");
//		System.out.println("Before manual sorting" + m);
//		Map<Integer, String> mm = new TreeMap<Integer, String>((a, b) -> b - a);
//		mm.put(2, "two");
//		mm.put(3, "three");
//		mm.put(1, "one");
//		System.out.println("Before manual sorting" + mm);

		Student s1 = new Student(2, "Chiller");
		Student s2 = new Student(3, "Ubaid");
		Student s3 = new Student(33, "Shadab");
		List<Student> list = new ArrayList<Student>();
		list.add(s1);
		list.add(s2);
		list.add(s3);
		Collections.sort(list, (a, b) -> b.id - a.id);
		System.out.println(list);

	}

}
