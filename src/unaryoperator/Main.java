package unaryoperator;

import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;

public class Main {

	public static void main(String[] args) {

		UnaryOperator<Integer> unaryoperator1 = x -> x * x;
		System.out.println(unaryoperator1.apply(5));

		UnaryOperator<String> unaryoperator2 = str -> str.toLowerCase();
		System.out.println(unaryoperator2.apply("AMMAR"));

		BinaryOperator<String> binaryoperator = (str1, str2) -> str1 + str2;
		System.out.println(binaryoperator.apply("Hello", "World."));
	}

}
