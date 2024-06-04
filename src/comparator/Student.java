package comparator;

public class Student {

	public Integer id;
	public String name;

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}

	public Student(Integer id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

}
