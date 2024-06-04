package comparator;

import java.util.Comparator;

public class MyClass implements Comparator<Integer> {

	@Override
	public int compare(Integer a, Integer b) {
		// TODO Auto-generated method stub
		return b-a;
		//for acceding order a-b;
		//for descending order b-a;
	}

}
