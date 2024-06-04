package function;

import java.util.function.Function;

public class FunctionChaining {

	public static void main(String[] args) {
//		Function<String, String> function1=s->s.toUpperCase();
//		Function<String, String> function2=s->s.substring(0,3);
//		Function<String, String> newFunctionCreated =function1.andThen(function2);
//		System.out.println(newFunctionCreated.apply("zainab"));

		Function<Integer, Integer> function1 = i -> 2 * i;
		Function<Integer, Integer> function2 = i -> i * i * i;
//		System.out.println(function1.andThen(function2).apply(3));// 216
//		System.out.println(function2.andThen(function1).apply(3));// 54
//		System.out.println(function1.compose(function2).apply(3));
		
		Function<String, String> identity = Function.identity();
		System.out.println(identity.apply("Fatima"));
		
		
	}

}
