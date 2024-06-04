package lambdaexpression;

public class Lambda1Impl implements Lambda1 {

	@Override
	public void some() {
		System.out.println("Hello from some method....!");
	}

	public static void main(String[] args) {

		Lambda1 i = () -> System.out.println("first lambda expression....");
		i.some();

		Lambda1 i2 = () -> System.out.println("second lambda expression....");
		i2.some();

		sumInter suminter = (a, b) -> a + b;
		System.out.println(suminter.sum(7, 9));
		System.out.println(suminter.sum(7, 14));

		LengthInter ref = (str -> str.length());

		System.out.println(ref.getLength("IBRAHIM"));
	}

}
