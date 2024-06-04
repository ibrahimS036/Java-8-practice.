package lambdaexpression;

public class Main {

	public static void main(String[] args) {
		Runnable obj = () -> {
			for (int i = 0; i <= 10; i++) {
				System.out.println("Hello:" + i);
			}
		};
		Thread childThread = new Thread(obj);
		childThread.run();

	}

}
