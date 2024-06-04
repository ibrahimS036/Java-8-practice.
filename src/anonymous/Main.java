package anonymous;

public class Main {
	int x = 10;

	private void doSome() {
		Employee em = () -> {

			System.out.println(this.x);
			return "100";
		};
		System.out.println(em.getSalary());
	}

	// anonymous inner class
	Employee em1 = new Employee() {

		@Override
		public String getSalary() {
			int x = 10;
			System.out.println(x);
			return "100";
		}
	};

}
