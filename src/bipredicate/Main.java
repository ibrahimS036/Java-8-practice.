package bipredicate;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;

public class Main {

	public static void main(String[] args) {
		
//		BiPredicate<String, Integer> bipredicate = (str, x) -> str.length() == x;
//		System.out.println(bipredicate.test("sanjay", 6));
		
		BiFunction<String, String, Integer> bifunction =(x,y)->(x.length()+y.length());
		System.out.println(bifunction.apply("vipul", "irfan"));
		
		BiConsumer<Integer, Integer> biconsumer=(x,y)-> System.out.println(x+y);
		biconsumer.accept(4, 8);

	}

}
