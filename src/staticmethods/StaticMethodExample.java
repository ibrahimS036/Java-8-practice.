package staticmethods;

interface A {
	static void sayHello() {
		System.out.println("Hello from A Class");
	}
}

public class StaticMethodExample {

	public static void main(String[] args) {
		StaticMethodExample ref = new StaticMethodExample();
		//static methods inside the interface we can only invoke them by using interface name.
		A.sayHello();
	}

}
