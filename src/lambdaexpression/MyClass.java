package lambdaexpression;

public class MyClass {

	public static void main(String[] args) {
//		MyInterface MyRef= (str->str.length());
//		System.out.println(MyRef.StringLength("Ibrahim"));
		MyInterface2 MyRef2 = (num) -> {
			return num * num;
		};

		int result = MyRef2.MyString(5);
		System.out.println("the result is:" + result);

	}

}
