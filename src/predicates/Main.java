package predicates;

import java.util.function.Predicate;

public class Main {

	public static void main(String[] args) {
		
//		Predicate<Integer> pre = x -> x > 1000;
//		System.out.println(pre.test(10000));
	 	
		Predicate<String> pre1 = x -> x.toLowerCase().charAt(0) == 'i';
		// System.out.println(pre1.test("ibrahim"));

		Predicate<String> pre2 = x -> x.toLowerCase().charAt(x.length() - 1) == 'm';
		// System.out.println(pre2.test("ibrahim"));

		Predicate<String> and = pre1.and(pre2);
		//System.out.println(and.test("ibrahim"));
		
		Predicate<String> or = pre1.or(pre2);
		//System.out.println(or.test("Ibrahim"));
		
		//System.out.println(pre1.negate().test("irshad"));
		
		Predicate<Object> equal = Predicate.isEqual("Umar");
		System.out.println(equal.test("Umar"));
		
		
	}
}
