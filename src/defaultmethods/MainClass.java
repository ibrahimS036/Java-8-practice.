package defaultmethods;

interface parent {
	default void sayHello() {
		System.out.println("Hello...!");
	}
}

interface child  {

	default void sayHello(int a) {
		System.out.println("Hello from child...!");
	}

}
public class MainClass implements parent,child{
 
	public static void main(String[] args) {
		MainClass ref = new MainClass();
		ref.sayHello();

	}

}
